package cafue.sisfu.entity.personal;

import cafue.sisfu.entity.tiro.Tiro;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "certificaciones")
public class Certificaciones {
    @Id
    @Getter
    @Setter
    private Long idCertificaciones;

    @Getter
    @Setter
    private String nombres;

    @Getter
    @Setter
    private String quienCertifica;

    @Getter
    @Setter
    private String year;

    @Getter
    @Setter
    @OneToMany()
    @JoinColumn(name = "id")
    private List<Artilleros> artilleros;

}

