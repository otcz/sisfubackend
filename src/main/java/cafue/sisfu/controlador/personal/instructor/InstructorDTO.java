package cafue.sisfu.controlador.personal.instructor;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

public class InstructorDTO {

    @Getter
    @Setter

    private Long id_instructor;

    @Getter
    @Setter
    @NotNull
    private String year;

    @Getter
    @Setter
    @NotNull
    private String materia;

}
