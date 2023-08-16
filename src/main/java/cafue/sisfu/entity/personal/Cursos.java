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
    private Long idCursos;

    @Getter
    @Setter
    private String nombres;

    @Getter
    @Setter
    private String year;

    @Getter
    @Setter
    @OneToMany()
    @JoinColumn(name = "id")
    private List<Artilleros> artilleros;






}
