package ekam.example.api.NewTest;

import com.testvagrant.ekam.testBases.testng.APITest;
import ekam.example.api.UserClient;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;


//import static com.testvagrant.ekam.commons.LayoutInitiator.Client;

public class GetUserPositiveTest extends APITest {

    @Test(groups = "api")
    public void apiExampleTest() {

        //Arrange
        int id = 2;


        //Act
        Response user = Client(UserClient.class).getSingleUser(id);

        //Assert
        Assert.assertNotNull(user.getData().getEmail());

    }
}