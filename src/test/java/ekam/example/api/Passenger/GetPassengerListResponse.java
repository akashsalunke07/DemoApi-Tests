package ekam.example.api.Passenger;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class GetPassengerListResponse{
	private String established;
	private String country;
	private String website;
	private String name;
	@SerializedName("head_quaters")
	private String headQuarters;
	private String logo;
	private String id;
	private String slogan;
}