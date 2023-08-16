package cafue.sisfu.entity.unidades;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unidad")
public class Unidad {
    @Id
    @Getter
    @Setter
    private String nombreUnidad;

    @Getter
    @Setter
    private String ubicacion;

    @Getter
    @Setter
    private String tipoUnidad;

    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "id")
    private List<Artilleros> artilleros;

    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "nroSerie")
    private List<Sistema> sistemas;

    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "idMunicion")
    private List<Municion> municions;

    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "idTiro")
    private List<Tiro> tiros;

}
