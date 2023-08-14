package cafue.sisfu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "despliegues")
public class Despliegues {
    @Id
    @Getter
    @Setter
    private Long id;

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
    @OneToMany(mappedBy = "despliegues")
    private List<Artilleros> artilleros;



}
