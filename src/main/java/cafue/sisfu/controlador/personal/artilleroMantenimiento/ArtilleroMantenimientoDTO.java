package cafue.sisfu.controlador.personal.artilleroMantenimiento;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

public class ArtilleroMantenimientoDTO {

    @Getter
    @Setter
    private Long idArtilleroMantenimiento;

    @NotNull
    @Getter
    @Setter
    private int year;

    @NotNull
    @Getter
    @Setter
    private Long idMantenimientoPersonal;

    @NotNull
    @Getter
    @Setter
    private Long idArtillero;


}
