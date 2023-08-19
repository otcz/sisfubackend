package cafue.sisfu.controlador.tiro.tiro_sistema;

import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

public class TiroSistemaControllerDTO {

    @NotNull
    @Getter
    @Setter
    private Long idTiroSistemas;

    @NotNull
    @Getter
    @Setter
    private Long idTiro;

    @NotNull
    @Getter
    @Setter
    private String nroSerie;


}
