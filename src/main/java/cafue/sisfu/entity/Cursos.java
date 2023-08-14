package cafue.sisfu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "cursos")
public class Cursos {
    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nombres;

    @Getter
    @Setter
    private String year;

    @Getter
    @Setter
    @OneToMany(mappedBy = "cursos")
    private List<Artilleros> artilleros;



}
