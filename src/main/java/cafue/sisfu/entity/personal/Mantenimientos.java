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
    @Column(name = "id_mantenimiento_personal")
    private Long id_mantenimiento_personal;

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
    private String sistema;

    @Getter
    @Setter
    @Column(name = "tipo_falla")
    private String tipo_falla;

}
