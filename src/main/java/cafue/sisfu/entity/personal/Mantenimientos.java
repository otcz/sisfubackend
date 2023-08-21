package cafue.sisfu.entity.personal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mantenimientos_personal")
public class Mantenimientos {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mantenimiento_personal")
    private Long idMantenimientoPersonal;

    @Getter
    @Setter
    @Column(name = "fecha")
    private Date fecha;

    @Getter
    @Setter
    @Column(name = "unidad")
    private String unidad;

    @Getter
    @Setter
    @Column(name = "sistema")
    private int sistema;

    @Getter
    @Setter
    @Column(name = "tipo_falla")
    private String tipoFalla;

}
