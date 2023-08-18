package cafue.sisfu.controlador.unidades;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UnidadDTO {

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String nombre_unidad;

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String ubicacion;

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String tipo_unidad;

}
