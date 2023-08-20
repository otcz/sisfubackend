package cafue.sisfu.controlador.personal.ArtilleroCertificacion;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Certificaciones;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
