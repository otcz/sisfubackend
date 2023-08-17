package cafue.sisfu.entity.municion;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.unidades.Unidad;
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
    @Column(name = "id_municion")
    private Long id_municion;

    @Getter
    @Setter
    @Column(name = "lote")
    private String lote;

    @Getter
    @Setter
    @Column(name = "fecha_compra")
    private Date fecha_compra;

    @Getter
    @Setter
    @Column(name = "fecha_vence")
    private Date fecha_vence;

    @Getter
    @Setter
    @Column(name = "ubicacion")
    private String ubicacion;

    @Getter
    @Setter
    @Column(name = "tipo_sistema")
    private int tipo_sistema;





}
