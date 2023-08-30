package cafue.sisfu.controlador.sistema;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.unidades.Unidad;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class SistemaDTO {

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String nroSerie;

    @Getter
    @Setter
    @NotNull
    private int tipoSistema;

    @Getter
    @Setter
    @NotNull
    private Long idArtillero;

    @Getter
    @Setter
    @NotNull
    private String ubicacion;

    @Getter
    @Setter
    @NotNull
    private int estadoSistema;

    @Getter
    @Setter
    @NotNull
    private String nombreUnidad;;

}
