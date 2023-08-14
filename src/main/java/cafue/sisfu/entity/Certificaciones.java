package cafue.sisfu.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "certificaciones")
public class Certificaciones {
    @Id
    @Getter
    @Setter
    private Long id;

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
    @OneToMany(mappedBy = "certificaciones")
    private List<Artilleros> artilleros;

}

