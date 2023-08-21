package cafue.sisfu.controlador.personal.artilleroDespliegues;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

public class ArtilleroDesplieguesDTO {

    @Getter
    @Setter
    private Long idArtilleroDespliegues;

    @NotNull
    @Getter
    @Setter
    private Long idArtillero;

    @NotNull
    @Getter
    @Setter
    private Long idDespliegues;


}
