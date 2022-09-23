package ekam.example.api.Passenger;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import retrofit2.Call;
import retrofit2.http.*;
import com.testvagrant.ekam.reports.annotations.APIStep;

import java.util.List;

public class GetPassengerClient extends RetrofitBaseClient {

    private interface GetPassengerClientService {

        @GET("/v1/airlines")
        Call<List<GetPassengerListResponse>> getPassengers ();
    }
    private final GetPassengerClientService service;

    @Inject
    public GetPassengerClient(@Named("passenger") String passenger) {
        super(passenger);
        service = httpClient.getService(GetPassengerClientService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public List<GetPassengerListResponse> getPassengers() {
        Call<List<GetPassengerListResponse>> call = service.getPassengers();
        return httpClient.execute(call);
    }

}