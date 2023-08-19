package cafue.sisfu.controlador.municion.municio_sistema;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.municion.Municion_Sistemas;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.repository.municion.MunicionRepository;
import cafue.sisfu.repository.municion.MunicionSistemaRepository;
import cafue.sisfu.repository.sistemas.SistemaRepository;
import cafue.sisfu.servicios.municion.MunicionSistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/municionS")
public class MunicionSistemaController {

    private final MunicionRepository municionRepository;
    private final SistemaRepository sistemaRepository;
    private final MunicionSistemaService municionSistemaRepository;

    @Autowired
    public MunicionSistemaController(MunicionRepository municionRepository, SistemaRepository sistemaRepository, MunicionSistemaService municionSistemaRepository) {
        this.municionRepository = municionRepository;
        this.sistemaRepository = sistemaRepository;
        this.municionSistemaRepository = municionSistemaRepository;

    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarMunicionSistema(@RequestBody @Validated MunicionSistemaControllerDTO unidadDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Municion_Sistemas municion_sistemas = new Municion_Sistemas();
        municion_sistemas.setIdMunicionSistemas(unidadDTO.getIdMunicionSistemas());

        Sistema sistema = sistemaRepository.findByNroSerie(unidadDTO.getNroSerie());
        Municion municion = municionRepository.findByIdMunicion(unidadDTO.getIdMunicion());

        municion_sistemas.setSistema(sistema);
        municion_sistemas.setMunicion(municion);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return municionSistemaRepository.guardarMunicionSistema(municion_sistemas);
    }


}
