package cafue.sisfu.entity.municion;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.unidades.Unidad;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "municion")
public class Municion {
    @Id
    @Getter
    @Setter
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_municion")
    private Long idMunicion;

    @Getter
    @Setter
    @Column(name = "lote")
    private String lote;

    @Getter
    @Setter
    @Column(name = "cantidad")
    private int cantidad;

    @Getter
    @Setter
    @Column(name = "fecha_compra")
    private String fecha_compra;

    @Getter
    @Setter
    @Column(name = "fecha_vence")
    private String fecha_vence;

    @Getter
    @Setter
    @Column(name = "ubicacion")
    private String ubicacion;

    @Getter
    @Setter
    @Column(name = "tipo_sistema")
    private long tipo_sistema;





}
