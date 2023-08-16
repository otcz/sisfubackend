package cafue.sisfu.entity.personal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "instructor")
public class Instructor {
    @Id
    @Getter
    @Setter
    private Long idInstructor;

    @Getter
    @Setter
    private String year;

    @Getter
    @Setter
    private String materia;

    @Getter
    @Setter
    @OneToMany()
    @JoinColumn(name = "id")
    private List<Artilleros> artilleros;



}
