package ekam.example.api.gorestGetUser;

import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import ekam.example.api.DataProviderForApi;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserTest extends APITest {

    @Test(groups = "api", dataProvider = "validUserIds" , dataProviderClass = DataProviderForApi.class)
    public void shouldGetUser(int id) {

        //Act


        //Arrange
        GetUserResponse response = Client(GorestUserClient.class).getSingleUser(id);

        //Assert
        Assert.assertNotNull(response);

    }
}