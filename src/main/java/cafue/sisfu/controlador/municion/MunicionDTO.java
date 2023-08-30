package cafue.sisfu.controlador.municion;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class MunicionDTO {

    @Getter
    @Setter
    private Long idMunicion;

    @Getter
    @Setter
    @NotNull
    private String lote;

    @Getter
    @Setter
    @NotNull
    private int cantidad;

    @Getter
    @Setter
    @NotNull
    private String fechaCompra;

    @Getter
    @Setter
    @NotNull
    private String fechaVence;

    @Getter
    @Setter
    @NotNull
    private String ubicacion;

    @Getter
    @Setter
    @NotNull
    private int tipoSistema;




}
