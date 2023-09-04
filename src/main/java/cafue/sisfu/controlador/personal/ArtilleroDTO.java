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
    private Long idArtillero;



    @Getter
    @Setter
    @NotEmpty(message = "El campo 'nombres' no debe estar vacío")
    private String nombres;


    @Getter
    @Setter
    private String valor;


    @Getter
    @Setter
    @NotEmpty(message = "El campo 'nombreUnidad' no debe estar vacío")
    private String nombreUnidad;

}
