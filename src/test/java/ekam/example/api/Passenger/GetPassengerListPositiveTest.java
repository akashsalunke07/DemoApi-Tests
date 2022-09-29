package ekam.example.api.Passenger;

import com.testvagrant.ekam.testBases.testng.APITest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GetPassengerListPositiveTest extends APITest {

    @Test(groups = "api")
    public void shouldGetListOfPassengers() {

        //Arrange

        //Act
        List<GetPassengerListResponse> passengerListResponse = Client(GetPassengerClient.class).getPassengers();

        //Assert
        Assert.assertNotNull(passengerListResponse.size());
    }
}