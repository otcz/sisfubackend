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
    @Getter
    @Setter
    @NotNull
    @Column(name = "id_artillero_certificacion")
    private Long id_artillero_certificacion;

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
