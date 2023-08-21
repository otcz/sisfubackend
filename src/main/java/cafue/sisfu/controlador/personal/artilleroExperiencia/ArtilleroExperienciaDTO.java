package cafue.sisfu.controlador.personal.artilleroExperiencia;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

public class ArtilleroExperienciaDTO {

    @Getter
    @Setter
    private Long idArtilleroExperiencia;

    @NotNull
    @Getter
    @Setter
    private Long idArtillero;

    @NotNull
    @Getter
    @Setter
    private Long idExperiencia;



}
