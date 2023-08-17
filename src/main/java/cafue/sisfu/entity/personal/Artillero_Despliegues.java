package cafue.sisfu.entity.personal;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "artillero_despliegues")
public class Artillero_Despliegues {
    @Id
    @Getter
    @Setter
    @NotNull
    @Column(name = "id_artillero_despliegues")
    private Long id_artillero_despliegues;


    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artillero;

    @ManyToOne
    @JoinColumn(name = "id_despliegues")
    private Despliegues despliegues;
}
