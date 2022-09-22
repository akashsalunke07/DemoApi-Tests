package ekam.example.api.CreateUserTest;

import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import ekam.example.api.UserClient;
import ekam.example.api.UserLogin.LoginRequest;
import ekam.example.api.UserLogin.LoginResponse;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CreateUserPositiveTest extends APITest {

    @Test(groups = "api")
    public void apiExampleTest() {

        //Arrange
        CreateUserRequest userRequest = CreateUserRequest.builder()
                                        .name("Akash Salunke")
                                        .job("SDET")
                                        .build();

        String token = Client(LoginResponse.class).getToken();

        //Act
        CreateUserResponse userResponse = Client(UserClient.class).createUser(userRequest,token);

        //Assert
        assertEquals(userResponse.getJob(),"SDET");


    }
}