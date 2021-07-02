package my.projects.spring.dto.request;

import javax.validation.constraints.Size;
import lombok.Getter;
import my.projects.spring.lib.FieldsValueMatch;
import my.projects.spring.lib.ValidEmail;

@FieldsValueMatch(
        field = "password",
        fieldMatch = "repeatPassword",
        message = "Passwords do not match!"
)
@Getter
public class UserRequestDto {
    @ValidEmail
    private String email;
    @Size(min = 8, max = 40)
    private String password;
    private String repeatPassword;

}
