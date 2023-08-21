package cafue.sisfu.controlador.personal.artilleriaDespliegues;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Despliegues;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
