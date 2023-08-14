package cafue.sisfu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "instructor")
public class Instructor {
    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String year;

    @Getter
    @Setter
    private String materia;

    @Getter
    @Setter
    @OneToMany(mappedBy = "instructor")
    private List<Artilleros> artilleros;



}
