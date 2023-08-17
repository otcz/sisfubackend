package cafue.sisfu.entity.personal;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "artillero_mantenimiento")
public class Artillero_Mantenimiento {
    @Id
    @Getter
    @Setter
    @NotNull
    @Column(name = "id_artillero_mantenimiento")
    private Long id_artillero_mantenimiento;


    @Getter
    @Setter
    @NotNull
    @Column(name = "year")
    private int year;

    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artillero;

    @ManyToOne
    @JoinColumn(name = "id_mantenimientos_persona")
    private Mantenimientos mantenimientos;
}
