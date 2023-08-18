package cafue.sisfu.controlador.sistema;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SistemaDTO {

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String nro_serie;

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private int tipo_sistema;



}
