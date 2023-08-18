package cafue.sisfu.controlador.sistema;

import cafue.sisfu.entity.personal.Artilleros;
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
    private int tipo_sistema;

    @Getter
    @Setter
    private Long id_artillero;



}
