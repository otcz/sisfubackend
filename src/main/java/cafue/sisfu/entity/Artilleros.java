package cafue.sisfu.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "Artillero")
public class Artilleros {
    @Id
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String nombres;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "idCursos")
    private Cursos cursos;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "idCertificaciones")
    private Certificaciones certificaciones;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "idMantenimientos")
    private Mantenimientos mantenimientos;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "idExperiencias")
    private Experiencia experiencias;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "idDespliegues")
    private Despliegues despliegues;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "idInstructor")
    private Instructor instructor;
}
