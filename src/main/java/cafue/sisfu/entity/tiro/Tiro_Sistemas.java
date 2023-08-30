package cafue.sisfu.entity.tiro;

import cafue.sisfu.entity.sistemas.Sistema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "tiro_sistemas")
public class Tiro_Sistemas {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tiro_sistemas")
    private Long idTiroSistemas;


    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "id_tiro")
    private Tiro tiro;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nro_serie")
    private Sistema sistema;



}
