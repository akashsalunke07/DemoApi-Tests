package ekam.example.api.gorestCreateUser;

import lombok.Data;

@Data
public class GoRestCreateUserResponse {
	private String gender;
	private String name;
	private int id;
	private String email;
	private String status;
}