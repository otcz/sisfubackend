package cafue.sisfu.entity.personal;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.unidades.Unidad;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "artillero")
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
    @JoinColumn(name = "idMantenimientoPersonal")
    private Mantenimientos mantenimientos;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "idExperiencia")
    private Experiencia experiencia;

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

    @Getter
    @Setter
    @Nullable
    @OneToOne
    @JoinColumn(name = "nroSerie")
    private Sistema sistema;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nombreUnidad")
    private Unidad unidad;



    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "idMantenimiento")
    private List<Mantenimiento> mantenimiento;

    @Getter
    @Setter
    @Nullable
    @OneToMany
    @JoinColumn(name = "idTiro")
    private List<Tiro> tiros;

}
