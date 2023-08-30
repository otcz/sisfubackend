package cafue.sisfu.controlador.personal;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.unidades.Unidad;
import cafue.sisfu.repository.unidades.UnidadesRepository;
import cafue.sisfu.servicios.personal.ArtillerosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Artillero")
public class ArtilleroController {

    private final ArtillerosService artillerosService;
    private final UnidadesRepository unidadesRepository;

    @Autowired
    public ArtilleroController(ArtillerosService artillerosService, UnidadesRepository unidadesRepository) {
        this.artillerosService = artillerosService;
        this.unidadesRepository = unidadesRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroDTO artilleroDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artilleros artilleros = new Artilleros();
        artilleros.setIdArtillero(artilleroDTO.getIdArtillero());
        artilleros.setNombres(artilleroDTO.getNombres());
        artilleros.setValor(artilleroDTO.getValor());
        artilleros.setUnidad(unidadesRepository.findByNombreUnidad(artilleroDTO.getNombreUnidad()));


        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artillerosService.guardarArtillero(artilleros);
    }

    @GetMapping("/{nombreUnidad}/artilleros")
    public List<Artilleros> getArtillerosPorUnidad(@PathVariable String nombreUnidad) {
        Unidad unidad = unidadesRepository.findByNombreUnidad(nombreUnidad);
        return artillerosService.getArtillerosPorUnidad(unidad);
    }

    @GetMapping("/cout")
    public ResponseEntity<Integer> getArtillerosSize() {
        int count = artillerosService.cout();
        return ResponseEntity.ok(count);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Artilleros>> getArtillerosAll() {
        List<Artilleros> artillerosList = artillerosService.all();
        return ResponseEntity.ok(artillerosList);
    }


}
