package cafue.sisfu.entity.personal;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Table(name = "artillero")
public class Artilleros {
    @Id
    @Getter
    @Setter
    @NotNull
    @Column(name = "id_artillero")
    private Long idArtillero;

    @Getter
    @Setter
    @NotNull
    @Column(name = "nombres")
    private String nombres;
}
