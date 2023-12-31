package cafue.sisfu.entity.personal;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name = "despliegues")
public class Despliegues {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_despliegues")
    private Long idDespliegues;

    @Getter
    @Setter
    @NotNull
    @Column(name = "year")
    private int year;

    @Getter
    @Setter
    @Column(name = "unidad")
    private String unidad;

    @Getter
    @Setter
    @Column(name = "ubicacion")
    private String ubicacion;

    @Getter
    @Setter
    @Column(name = "nro_serie")
    private String nroSerie;

    @Getter
    @Setter
    @Column(name = "observaciones")
    private String observaciones;



}
