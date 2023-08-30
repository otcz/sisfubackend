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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_artillero_despliegues")
    private Long idArtilleroDespliegues;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artillero;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_despliegues")
    private Despliegues despliegues;


}
