package cafue.sisfu.entity.tiro;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "tiro_Artillero")
public class Tiro_Artillero {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tiro_artillero")
    private Long idTiroArtillero;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "id_tiro")
    private Tiro tiro;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artilleros;



}
