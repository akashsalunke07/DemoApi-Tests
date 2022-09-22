package ekam.example.api.UserLogin;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import retrofit2.Call;
import retrofit2.http.*;
import com.testvagrant.ekam.reports.annotations.APIStep;

public class LoginUserClientClient extends RetrofitBaseClient {

    private interface LoginUserClientService {

        @Headers({"Content-Type: application/json"})
        @POST("/api/login")
        Call<LoginResponse> login(@Body LoginRequest request);


    }

    private final LoginUserClientService service;

    @Inject
    public LoginUserClientClient(@Named("reqres") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(LoginUserClientService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public LoginResponse getSingleUser(LoginRequest request) {
        Call<LoginResponse> call = service.login(request);
        return httpClient.execute(call);
    }

}