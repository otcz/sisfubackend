package cafue.sisfu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "experiencia")
public class Experiencia {
    @Id
    @Getter
    @Setter
    private Long id;

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
    @OneToMany(mappedBy = "experiencias")
    private List<Artilleros> artilleros;



}
