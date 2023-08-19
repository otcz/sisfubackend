package cafue.sisfu.controlador.mantenimiento;

import cafue.sisfu.entity.sistemas.Sistema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class MantenimientoDTO {

    @Getter
    @Setter
    @NotNull
    private Long idMantenimiento;

    @Getter
    @Setter
    @Column(name = "unidad_realiza_mantenimiento")
    private String unidadRealizaMantenimiento;

    @Getter
    @Setter
    @Column(name = "fecha")
    private Date fecha;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nro_serie")
    private String nroSerie;
}
