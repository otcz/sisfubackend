package cafue.sisfu.entity.personal;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.unidades.Unidad;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artillero")
public class Artilleros {
    @Id
    @Getter
    @Setter
    @NotNull
    @Column(name = "id_artillero")
    private Long id_artillero;

    @Getter
    @Setter
    @NotNull
    @Column(name = "nombres")
    private String nombres;



}
