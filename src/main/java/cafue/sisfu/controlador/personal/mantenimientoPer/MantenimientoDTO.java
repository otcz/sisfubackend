package cafue.sisfu.controlador.personal.mantenimientoPer;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class MantenimientoDTO {

    @Getter
    @Setter
    private Long idMantenimientoPersonal;

    @Getter
    @Setter
    @NotNull
    private String fecha;

    @Getter
    @Setter
    @NotNull
    private String unidad;

    @Getter
    @Setter
    @NotNull
    private int sistema;

    @Getter
    @Setter
    @NotNull
    private String tipoFalla;


}
