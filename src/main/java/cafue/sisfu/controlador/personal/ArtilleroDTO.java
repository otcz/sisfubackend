package cafue.sisfu.controlador.personal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ArtilleroDTO {

    @Getter
    @Setter
    @NotNull
    private Long id_artillero;

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String nombres;

}
