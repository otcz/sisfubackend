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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id_certificaciones")
    private Long id_certificaciones;

    @Getter
    @Setter
    @Column(name = "nombres")
    private String nombres;

    @Getter
    @Setter
    @Column(name = "quien_certifica")
    private String quien_certifica;




}

