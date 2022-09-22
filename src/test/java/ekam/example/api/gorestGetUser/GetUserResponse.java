package ekam.example.api.gorestGetUser;


import lombok.Getter;

@Getter
public class GetUserResponse {
	private String gender;
	private String name;
	private int id;
	private String email;
	private String status;
}