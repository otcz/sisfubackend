package cafue.sisfu.entity.personal;

import cafue.sisfu.entity.unidades.Unidad;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

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
    @NotEmpty
    @Column(name = "nombres")
    private String nombres;

    @Getter
    @Setter
    @Column(name = "valor")
    private String valor;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "nombre_unidad")
    private Unidad unidad;
}
