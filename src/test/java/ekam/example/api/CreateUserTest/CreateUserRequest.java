package ekam.example.api.CreateUserTest;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CreateUserRequest{
	private String name;
	private String job;
}