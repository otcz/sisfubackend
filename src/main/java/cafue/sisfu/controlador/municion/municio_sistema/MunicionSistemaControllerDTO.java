package cafue.sisfu.controlador.municion.municio_sistema;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.sistemas.Sistema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MunicionSistemaControllerDTO {


    @Getter
    @Setter
    @NotNull
    private Long idMunicionSistemas;


    @Getter
    @Setter
    @NotNull
    private Long idMunicion;

    @Getter
    @Setter
    @NotNull
    private String nroSerie;

}
