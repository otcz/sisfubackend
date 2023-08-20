package cafue.sisfu.controlador.personal.despliegues;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class DespliegueDTO {

    @Getter
    @Setter
    private Long idDespliegues;

    @Getter
    @Setter
    @NotNull
    private int year;

    @Getter
    @Setter
    @NotNull
    private String unidad;

    @Getter
    @Setter
    @NotNull
    private String ubicacion;

    @Getter
    @Setter
    @NotNull
    private String nroSerie;

    @Getter
    @Setter
    @NotNull
    private String observaciones;



}
