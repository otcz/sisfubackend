package cafue.sisfu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "mantenimientos")
public class Mantenimientos {
    @Id
    @Getter
    @Setter
    private Long id;

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
    @OneToMany(mappedBy = "mantenimientos")
    private List<Artilleros> artilleros;



}
