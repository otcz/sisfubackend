package cafue.sisfu.controlador.account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AccountDTO {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String user;

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String password;

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String rol;



}
