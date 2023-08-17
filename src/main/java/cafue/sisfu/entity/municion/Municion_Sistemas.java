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
@Table(name = "municion_sistemas")
public class Municion_Sistemas {
    @Id
    @Getter
    @Setter
    @Column(name = "id_municion_sistemas")
    private Long id_municion_sistemas;


    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_municion")
    private Municion id_municion;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nro_serie")
    private Sistema sistema;



}