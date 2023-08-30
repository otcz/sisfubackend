package cafue.sisfu.controlador.sistema;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.unidades.Unidad;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.unidades.UnidadesRepository;
import cafue.sisfu.servicios.sistemas.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sistemas")
public class SistemaController {

    private final ArtilleroRepository artilleroRepository;
    private final UnidadesRepository unidadesRepository;
    private final SistemaService sistemaService;

    @Autowired
    public SistemaController(ArtilleroRepository artilleroRepository, UnidadesRepository unidadesRepository, SistemaService sistemaService) {
        this.artilleroRepository = artilleroRepository;
        this.unidadesRepository = unidadesRepository;
        this.sistemaService = sistemaService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated SistemaDTO unidadDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Sistema sistema = new Sistema();
        sistema.setNroSerie(unidadDTO.getNroSerie());
        sistema.setUbicacion(unidadDTO.getUbicacion());
        sistema.setTipoSistema(unidadDTO.getTipoSistema());
        sistema.setEstadoSistema(unidadDTO.getEstadoSistema());
        sistema.setArtilleros(artilleroRepository.findArtillerosByIdArtillero(unidadDTO.getIdArtillero()));
        sistema.setNombreUnidad(unidadesRepository.findByNombreUnidad(unidadDTO.getNombreUnidad()));

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return sistemaService.sistemaUnidades(sistema);
    }


    @GetMapping("/{nombreUnidad}/sistemas")
    public List<Sistema> getSistemasPorUnidad(@PathVariable String nombreUnidad, @RequestParam int tipoSistema) {
        Unidad unidad = unidadesRepository.findByNombreUnidad(nombreUnidad);
        return sistemaService.getSistemasPorUnidad(unidad, tipoSistema);
    }


}
