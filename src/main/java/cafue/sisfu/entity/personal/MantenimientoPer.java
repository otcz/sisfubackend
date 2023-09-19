package cafue.sisfu.entity.personal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "mantenimientos_personal")
public class MantenimientoPer {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mantenimiento_personal")
    private Long idMantenimientoPersonal;

    @Getter
    @Setter
    @Column(name = "fecha")
    private String fecha;

    @Getter
    @Setter
    @Column(name = "tipo_falla")
    private String tipoFalla;

    @Getter
    @Setter
    @Column(name = "unidad")
    private String unidad;

    @Getter
    @Setter
    @Column(name = "sistema")
    private int sistema;



}
