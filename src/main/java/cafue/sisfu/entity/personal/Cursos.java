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


    @Getter
    @Setter
    @Column(name = "valor_curso")
    private int valorCurso;

    @Getter
    @Setter
    @Column(name = "costo")
    private double costo;


    @Getter
    @Setter
    @Column(name = "sigla")
    private String sigla;



}
