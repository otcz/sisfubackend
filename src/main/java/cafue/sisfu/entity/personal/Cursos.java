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
    @Column(name = "id_cursos")
    private Long id_cursos;

    @Getter
    @Setter
    @Column(name = "nombres")
    private String nombres;










}
