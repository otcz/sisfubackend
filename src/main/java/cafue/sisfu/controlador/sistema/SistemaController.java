package cafue.sisfu.controlador.sistema;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.servicios.sistemas.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/sistemas")
public class SistemaController {

    private final ArtilleroRepository artilleroRepository;
    private final SistemaService sistemaService;

    @Autowired
    public SistemaController(ArtilleroRepository artilleroRepository, SistemaService sistemaService) {
        this.artilleroRepository = artilleroRepository;
        this.sistemaService = sistemaService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated SistemaDTO unidadDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Sistema sistema = new Sistema();
        sistema.setNroSerie(unidadDTO.getNro_serie());
        sistema.setTipo_sistema(unidadDTO.getTipo_sistema());
        Artilleros artillero = artilleroRepository.findById(unidadDTO.getId_artillero()).orElse(null);
        System.out.println(artillero.getNombres());
        sistema.setArtilleros(artillero);
        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return sistemaService.sistemaUnidades(sistema);
    }


}
