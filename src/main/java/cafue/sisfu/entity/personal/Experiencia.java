package cafue.sisfu.entity.personal;

import com.sun.istack.NotNull;
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
    @Column(name = "id_experiencia")
    private Long id_experiencia;

    @Getter
    @Setter
    @Column(name = "sistema")
    private int sistema;

    @Getter
    @Setter
    @NotNull
    @Column(name = "year")
    private int year;

    @Getter
    @Setter
    @Column(name = "ubicacion")
    private String ubicacion;

    @Getter
    @Setter
    @Column(name = "unidad")
    private String unidad;

    @Getter
    @Setter
    @Column(name = "carga")
    private int carga;

    @Getter
    @Setter
    @Column(name = "distancia")
    private double distancia;

    @Getter
    @Setter
    @Column(name = "cantidad_granadas")
    private int cantidad_granadas;





}
