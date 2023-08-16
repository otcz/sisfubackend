package cafue.sisfu.entity.sistemas;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.personal.*;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.unidades.Unidad;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sistema")
public class Sistema {
    @Id
    @Getter
    @Setter
    private String nroSerie;

    @Getter
    @Setter
    private int tipoSistema;

    @Getter
    @Setter
    @Nullable
    @OneToOne
    @JoinColumn(name = "id")
    private Artilleros artilleros;

    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "idMunicion")
    private List<Municion> municion;

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
    @JoinColumn(name = "idTiro")
    private List<Tiro> tiros;

    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "idMantenimiento")
    private List<Mantenimiento> mantenimientos;

}
