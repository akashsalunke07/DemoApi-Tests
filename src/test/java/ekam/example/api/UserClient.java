package ekam.example.api;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import com.testvagrant.ekam.api.retrofit.RetrofitBaseClient;
import com.testvagrant.ekam.reports.annotations.APIStep;
import ekam.example.api.CreateUserTest.CreateUserRequest;
import ekam.example.api.CreateUserTest.CreateUserResponse;
import ekam.example.api.NewTest.Response;
import retrofit2.Call;
import retrofit2.http.*;

public class UserClient extends RetrofitBaseClient {

    private interface UserService {
        @GET("/api/users/{id}")
        Call<Response> getSingleUser(
                @Path("id") int id
        );


        @Headers({"Content-Type: application/json"})
        @POST("/api/users")
        Call<CreateUserResponse> createUser(
                @Body CreateUserRequest request,
                @Header("authorization") String token);
        
    }

    private final UserService service;

    @Inject
    public UserClient(@Named("reqres") String baseUrl) {
        super(baseUrl);
        service = httpClient.getService(UserService.class);
    }

    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public Response getSingleUser(int id) {
        Call<Response> call = service.getSingleUser(id);
        return httpClient.execute(call);
    }


    @APIStep(keyword = "When", description = "I invoke getSingleUser API")
    public CreateUserResponse createUser(CreateUserRequest request , String token) {
        Call<CreateUserResponse> call = service.createUser(request,token);
        return httpClient.execute(call);
    }


}