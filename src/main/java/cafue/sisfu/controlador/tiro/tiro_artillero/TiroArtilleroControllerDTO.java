package cafue.sisfu.controlador.tiro.tiro_artillero;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.tiro.Tiro;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

public class TiroArtilleroControllerDTO {

    @NotNull
    @Getter
    @Setter
    private Long idTiroArtillero;

    @NotNull
    @Getter
    @Setter
    private Long idTiro;

    @NotNull
    @Getter
    @Setter
    private Long idArtillero;


}
