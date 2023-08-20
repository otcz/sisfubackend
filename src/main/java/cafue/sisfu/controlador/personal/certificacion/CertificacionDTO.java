package cafue.sisfu.controlador.personal.certificacion;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Certificaciones;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CertificacionDTO {

    @Getter
    @Setter
    private Long idCertificaciones;

    @Getter
    @Setter
    @NotNull
    private String nombre;

    @Getter
    @Setter
    @NotNull
    private String quienCertifica;

}
