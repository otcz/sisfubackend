package cafue.sisfu.controlador.personal.artilleroCurso;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Cursos;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

public class ArtilleroCursoDTO {

    @Getter
    @Setter
    private Long idArtilleroCurso;


    @Getter
    @Setter
    @NotNull
    private int year;

    @Getter
    @Setter
    @NotNull
    private Long idArtillero;

    @Getter
    @Setter
    @NotNull
    private Long idCursos;



}
