package cafue.sisfu.controlador.personal.artilleroInstructor;

import com.sun.istack.NotNull;
import jdk.internal.net.http.common.Log;
import lombok.Getter;
import lombok.Setter;

public class ArtilleroInstructorDTO {

    @Getter
    @Setter
    private Long idArtilleroInstructor;

    @NotNull
    @Getter
    @Setter
    private Long idArtillero;

    @NotNull
    @Getter
    @Setter
    private int year;

    @NotNull
    @Getter
    @Setter
    private Long idInstructor;



}
