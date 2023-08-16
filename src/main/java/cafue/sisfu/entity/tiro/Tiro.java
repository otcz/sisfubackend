package cafue.sisfu.entity.tiro;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.unidades.Unidad;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tiro")
public class Tiro {
    @Id
    @Getter
    @Setter
    private Long idTiro;

    @Getter
    @Setter
    private String ubicacion;


    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "id")
    private Artilleros artilleros;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nroSerie")
    private Sistema sistema;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nombreUnidad")
    private Unidad unidad;

    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "idMunicion")
    private List <Municion> municion;


}
