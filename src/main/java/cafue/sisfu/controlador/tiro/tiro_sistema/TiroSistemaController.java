package cafue.sisfu.controlador.tiro.tiro_sistema;

import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.tiro.Tiro_Sistemas;
import cafue.sisfu.repository.sistemas.SistemaRepository;
import cafue.sisfu.repository.tiro.TiroServicioRepository;
import cafue.sisfu.repository.tiro.TiroSistemasRepository;
import cafue.sisfu.servicios.tiro.TiroSistemasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/tiroS")
public class TiroSistemaController {

    private final TiroServicioRepository tiroServicioRepository;
    private final SistemaRepository sistemaRepository;
    private final TiroSistemasService tiroSistemasService;

    @Autowired
    public TiroSistemaController(TiroServicioRepository tiroServicioRepository, SistemaRepository sistemaRepository, TiroSistemasService tiroSistemasService) {
        this.tiroServicioRepository = tiroServicioRepository;
        this.sistemaRepository = sistemaRepository;
        this.tiroSistemasService = tiroSistemasService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarMunicionSistema(@RequestBody @Validated TiroSistemaControllerDTO unidadDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Tiro_Sistemas tiroSistema = new Tiro_Sistemas();
        tiroSistema.setIdTiroSistemas(unidadDTO.getIdTiroSistemas());

        Sistema sistema = sistemaRepository.findByNroSerie(unidadDTO.getNroSerie());
        Tiro tiro = tiroServicioRepository.findTiroByIdTiro(unidadDTO.getIdTiro());

        tiroSistema.setSistema(sistema);
        tiroSistema.setTiro(tiro);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return tiroSistemasService.guardarTiroSistemas(tiroSistema);
    }


}
