package cafue.sisfu.entity.personal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "experiencia")
public class Experiencia {
    @Id
    @Getter
    @Setter
    private Long idExperiencia;

    @Getter
    @Setter
    private String sistema;

    @Getter
    @Setter
    private String Years;

    @Getter
    @Setter
    private String ubicacion;

    @Getter
    @Setter
    private String unidad;

    @Getter
    @Setter
    private int carga;

    @Getter
    @Setter
    private double distancia;

    @Getter
    @Setter
    private int cantidadGranadas;

    @Getter
    @Setter
    @OneToMany()
    @JoinColumn(name = "id")
    private List<Artilleros> artilleros;



}
