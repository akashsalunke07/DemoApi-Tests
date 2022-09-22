package ekam.example.api.gorestCreateUser;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import retrofit2.Call;
import retrofit2.http.*;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class GoRestCreateUserClientClient extends RetrofitBaseClient {

    private interface GoRestCreateUserClientService {
        @Headers({"Content-Type: application/json"})
        @POST("/public/v2/users")
        Call<GoRestCreateUserResponse> goRestCreateUserResponse(
                @Body GoRestCreateUserRequest goRestCreateUserRequest,
                @Header("authorization") String goRestToken
        );
    }

    private final GoRestCreateUserClientService service;

    @Inject
    public GoRestCreateUserClientClient(@Named("baseUrl") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(GoRestCreateUserClientService.class);
    }


    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public GoRestCreateUserResponse goRestCreateUser(GoRestCreateUserRequest createUserRequest, String token) {

        Call<GoRestCreateUserResponse> call = service.goRestCreateUserResponse(createUserRequest,token);

        return httpClient.execute(call);
    }

}