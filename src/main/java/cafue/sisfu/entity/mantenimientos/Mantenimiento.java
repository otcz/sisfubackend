package cafue.sisfu.entity.mantenimientos;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mantenimiento")
public class Mantenimiento {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mantenimiento")
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
    private Sistema sistema;


}
