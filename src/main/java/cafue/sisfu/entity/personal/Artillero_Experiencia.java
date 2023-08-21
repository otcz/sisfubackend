package cafue.sisfu.entity.personal;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "artillero_experiencia")
public class Artillero_Experiencia {
    @Id
    @Getter
    @Setter
    @Column(name = "id_artillero_experiencia")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArtilleroExperiencia;


    @Getter
    @Setter
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artillero;

    @Getter
    @Setter
    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_experiencia")
    private Experiencia experiencia;
}
