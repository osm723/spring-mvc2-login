package hello.login.web.login;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LonginForm {

    @NotEmpty
    private String loginId;
    @NotEmpty
    private String password;
}
