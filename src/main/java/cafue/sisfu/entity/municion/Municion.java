package cafue.sisfu.entity.municion;

import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.unidades.Unidad;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "municion")
public class Municion {
    @Id
    @Getter
    @Setter
    private Long idMunicion;

    @Getter
    @Setter
    private String lote;

    @Getter
    @Setter
    private Date fechaCompra;

    @Getter
    @Setter
    private Date fechaVence;

    @Getter
    @Setter
    private String ubicacion;

    @Getter
    @Setter
    private int tipoSistema;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nroSerie")
    private Sistema sistema;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "nombreUnidad")
    private Unidad unidad;

    @Getter
    @Setter
    @Nullable
    @ManyToOne
    @JoinColumn(name = "idTiro")
    private Tiro tiro;

}
