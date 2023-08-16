package cafue.sisfu.entity.personal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mantenimientos")
public class Mantenimientos {
    @Id
    @Getter
    @Setter
    private Long idMantenimientoPersonal;

    @Getter
    @Setter
    private Date fecha;

    @Getter
    @Setter
    private String unidad;

    @Getter
    @Setter
    private String sistema;

    @Getter
    @Setter
    private String tipoFalla;


    @Getter
    @Setter
    @OneToMany ()
    @JoinColumn(name = "id")
    private List<Artilleros> artilleros;



}
