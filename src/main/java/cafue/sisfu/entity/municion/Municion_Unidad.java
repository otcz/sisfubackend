package cafue.sisfu.entity.municion;

import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.unidades.Unidad;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "municion_unidad")
public class Municion_Unidad {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municion_unidad")
    private Long idmunicionunidad;


    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_municion")
    private Municion municion;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nombre_unidad")
    private Unidad unidad;


}
