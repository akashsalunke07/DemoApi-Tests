package ekam.example.api.gorestGetUser;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import com.testvagrant.ekam.reports.annotations.APIStep;
import retrofit2.Call;
import retrofit2.http.*;

public class GorestUserClient extends RetrofitBaseClient {

    private interface GorestUserClientService {
        @GET("/public/v2/users/{id}")
        Call<GetUserResponse> getUser(@Path("id") int id);
    }

    private final GorestUserClientService service;

    @Inject
    public GorestUserClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GorestUserClientService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public GetUserResponse getSingleUser(int id) {
        Call<GetUserResponse> call = service.getUser(id);
        return httpClient.execute(call);
    }

}