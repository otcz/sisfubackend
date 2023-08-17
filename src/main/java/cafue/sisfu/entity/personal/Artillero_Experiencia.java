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
    @NotNull
    @Column(name = "id_artillero_experiencia")
    private Long id_artillero_experiencia;



    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artillero;

    @ManyToOne
    @JoinColumn(name = "id_experiencia")
    private Experiencia experiencia;
}
