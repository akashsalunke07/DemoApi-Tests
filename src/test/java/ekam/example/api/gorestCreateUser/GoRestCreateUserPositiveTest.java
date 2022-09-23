package ekam.example.api.gorestCreateUser;

import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import ekam.example.api.DataProviderForApi;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

import static org.testng.Assert.*;

public class GoRestCreateUserPositiveTest extends APITest {

    @Test(groups = "api")
    public void shouldCreateUser() {

        long startTime = System.nanoTime();


        //Arrange
        String name = "Akash";
        String email = "akashsalunke" + UUID.randomUUID() +"@gmail.com";
        String gender = "male";
        String status = "Active";

        String token = DataProviderForApi.AUTHORIZATION;

        GoRestCreateUserRequest request = GoRestCreateUserRequest.builder()
                .name(name)
                .email(email)
                .gender(gender)
                .status(status)
                .build();

        //Act
        GoRestCreateUserResponse response = Client(GoRestCreateUserClientClient.class).goRestCreateUser(request,token);


        //
        Assert.assertEquals(response.getEmail(),email);

        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("time taken in milliseconds is "+ elapsedTime/1000000);

    }
}