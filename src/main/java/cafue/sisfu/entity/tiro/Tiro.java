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
    @Column(name = "id_tiro")
    private Long idTiro;

    @Getter
    @Setter
    @Column(name = "ubicacion")
    private String ubicacion;

    @Getter
    @Setter
    @Column(name = "distancia")
    private String distancia;

    @Getter
    @Setter
    @Column(name = "carga")
    private String carga;

    @Getter
    @Setter
    @Column(name = "cantidad_granada")
    private long cantidadGranada;


}
