package cafue.sisfu.entity.personal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "despliegues")
public class Despliegues {
    @Id
    @Getter
    @Setter
    private Long idDespliegues;

    @Getter
    @Setter
    private String year;

    @Getter
    @Setter
    private String unidad;

    @Getter
    @Setter
    private String ubicacion;

    @Getter
    @Setter
    private String sistema;

    @Getter
    @Setter
    @OneToMany()
    @JoinColumn(name = "id")
    private List<Artilleros> artilleros;


}
