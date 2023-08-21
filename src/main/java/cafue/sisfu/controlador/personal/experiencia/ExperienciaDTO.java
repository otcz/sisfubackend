package cafue.sisfu.controlador.personal.experiencia;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

public class ExperienciaDTO {

    @Getter
    @Setter
    private Long idExperiencia;

    @Getter
    @Setter
    @NotNull
    private int sistema;

    @Getter
    @Setter
    @NotNull
    private int year;

    @Getter
    @Setter
    @NotNull
    private String ubicacion;

    @Getter
    @Setter
    @NotNull
    private String unidad;

    @Getter
    @Setter
    @NotNull
    private int carga;

    @Getter
    @Setter
    @NotNull
    private double distancia;

    @Getter
    @Setter
    @NotNull
    private int cantidadGranadas;

}
