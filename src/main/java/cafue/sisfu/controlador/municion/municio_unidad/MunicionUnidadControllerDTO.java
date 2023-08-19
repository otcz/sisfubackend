package cafue.sisfu.controlador.municion.municio_unidad;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.unidades.Unidad;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

public class MunicionUnidadControllerDTO {


    @Getter
    @Setter
    @NotNull
    private Long idMunicionUnidad;

    @Getter
    @Setter
    @NotNull
    private Long idMunicion;

    @Getter
    @Setter
    @NotNull
    private String nombreUnidad;

}
