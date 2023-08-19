package cafue.sisfu.controlador.tiro;

import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotNull;

public class TiroDTO {

    @Getter
    @Setter
    @NotNull
    private Long idTiro;

    @Getter
    @Setter
    @NotNull
    private String ubicacion;

    @Getter
    @Setter
    @NotNull
    private String distancia;

    @Getter
    @Setter
    @NotNull
    private String carga;

    @Getter
    @Setter
    @NotNull
    private long cantidadGranada;

}
