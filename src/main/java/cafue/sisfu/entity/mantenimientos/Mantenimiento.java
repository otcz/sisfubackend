package cafue.sisfu.entity.mantenimientos;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "mantenimiento")
public class Mantenimiento {
    @Id
    @Getter
    @Setter
    private Long idMantenimiento;

    @Getter
    @Setter
    private String unidadRealizaMantenimiento;

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


}
