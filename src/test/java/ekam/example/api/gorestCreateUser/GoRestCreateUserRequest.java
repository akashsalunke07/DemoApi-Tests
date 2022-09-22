package ekam.example.api.gorestCreateUser;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class GoRestCreateUserRequest {
	private String gender;
	private String name;
	private String email;
	private String status;
}