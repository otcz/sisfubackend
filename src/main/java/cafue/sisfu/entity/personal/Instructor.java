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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_instructor")
    private Long idInstructor;

    @Getter
    @Setter
    @Column(name = "year")
    private String year;

    @Getter
    @Setter
    @Column(name = "materia")
    private String materia;




}
