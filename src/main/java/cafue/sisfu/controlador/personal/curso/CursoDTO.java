package cafue.sisfu.controlador.personal.curso;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CursoDTO {

    @Getter
    @Setter
    private Long idCursos;

    @Getter
    @Setter
    @NotNull
    @NotEmpty
    private String nombres;


    @Getter
    @Setter
    @NotNull
    private int valor;

    @Getter
    @Setter
    private double costo;


}
