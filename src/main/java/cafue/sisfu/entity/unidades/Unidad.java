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
    @Column(name = "nombre_unidad")
    private String nombre_unidad;

    @Getter
    @Setter
    @Column(name = "ubicacion")
    private String ubicacion;

    @Getter
    @Setter
    @Column(name = "tipo_unidad")
    private String tipo_unidad;

}
