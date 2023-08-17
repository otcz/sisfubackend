package cafue.sisfu.entity.personal;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "artillero_curso")
public class Artillero_Curso {
    @Id
    @Getter
    @Setter
    @NotNull
    @Column(name = "id_artillero_curso")
    private Long id_artillero_curso;


    @Getter
    @Setter
    @NotNull
    @Column(name = "year")
    private int year;

    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artillero;

    @ManyToOne
    @JoinColumn(name = "id_cursos")
    private Cursos cursos;

}
