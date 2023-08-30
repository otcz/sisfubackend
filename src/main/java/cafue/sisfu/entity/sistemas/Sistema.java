package cafue.sisfu.entity.sistemas;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.municion.Municion_Sistemas;
import cafue.sisfu.entity.personal.*;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.tiro.Tiro_Sistemas;
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
    @Column(name = "nro_serie")
    private String nroSerie;

    @Getter
    @Setter
    @Column(name = "ubicacion")
    private String ubicacion;

    @Getter
    @Setter
    @Column(name = "estado_sistema")
    private int estadoSistema;

    @Getter
    @Setter
    @Column(name = "tipo_sistema")
    private int tipoSistema;

    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artilleros;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "nombre_unidad")
    private Unidad nombreUnidad;








}
