package cafue.sisfu.entity.personal;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cursos")
    private Long idCursos;

    @Getter
    @Setter
    @Column(name = "nombres")
    private String nombres;










}
