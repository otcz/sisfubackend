package cafue.sisfu.controlador.personal.mantenimiento;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.util.Date;

public class MantenimientoDTO {

    @Getter
    @Setter
    private Long idMantenimientoPersonal;

    @Getter
    @Setter
    @NotNull
    private Date fecha;

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
