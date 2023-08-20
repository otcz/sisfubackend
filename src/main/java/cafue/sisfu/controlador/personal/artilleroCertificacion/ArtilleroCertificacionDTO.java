package cafue.sisfu.controlador.personal.artilleroCertificacion;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

public class ArtilleroCertificacionDTO {

    @Getter
    @Setter
    private Long idArtilleroCertificacion;

    @Getter
    @Setter
    @NotNull
    private Long idArtillero;

    @Getter
    @Setter
    @NotNull
    private Long idCertificaciones;

}
