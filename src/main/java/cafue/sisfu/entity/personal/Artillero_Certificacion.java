package cafue.sisfu.entity.personal;

import cafue.sisfu.entity.sistemas.Sistema;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "artillero_certificacion")
public class Artillero_Certificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_artillero_certificacion")
    private Long idArtilleroCertificacion;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artilleros;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "id_certificaciones")
    private Certificaciones certificaciones;
}
