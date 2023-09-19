package cafue.sisfu.controlador.personal.artilleroMantenimiento;

import cafue.sisfu.entity.personal.*;
import cafue.sisfu.repository.personal.ArtilleroMantenimientosRepository;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.MantenimientosPerRepository;
import cafue.sisfu.servicios.personal.ArtilleroMantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/artillero/mantenimiento")
public class ArtilleroMantenimientoController {

    private final ArtilleroMantenimientoService artilleroMantenimientoService;

    private final MantenimientosPerRepository mantenimientosRepository;

    private final ArtilleroRepository artilleroRepository;

    private final ArtilleroMantenimientosRepository artilleroMantenimientosRepository;

    @Autowired
    public ArtilleroMantenimientoController(ArtilleroMantenimientoService artilleroMantenimientoService, MantenimientosPerRepository mantenimientosRepository, ArtilleroRepository artilleroRepository, ArtilleroMantenimientosRepository artilleroMantenimientosRepository) {

        this.artilleroMantenimientoService = artilleroMantenimientoService;
        this.mantenimientosRepository = mantenimientosRepository;
        this.artilleroRepository = artilleroRepository;
        this.artilleroMantenimientosRepository = artilleroMantenimientosRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroMantenimientoDTO artilleroInstructorDTO) {
        Artillero_Mantenimiento artilleroMantenimiento = new Artillero_Mantenimiento();
        artilleroMantenimiento.setYear(artilleroInstructorDTO.getYear());
        Artilleros artilleros = artilleroRepository.findArtillerosByIdArtillero(artilleroInstructorDTO.getIdArtillero());
        MantenimientoPer mantenimientos = mantenimientosRepository.findByIdMantenimientoPersonal(artilleroInstructorDTO.getIdMantenimientoPersonal());
        artilleroMantenimiento.setMantenimientos(mantenimientos);
        artilleroMantenimiento.setArtillero(artilleros);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artilleroMantenimientoService.guardarArtilleroMantenimientos(artilleroMantenimiento);
    }

    @GetMapping("/artillero/{idArtillero}/mantenimientos")
    public ResponseEntity<List<MantenimientoPer>> getMantenimientosRealizadosPorArtillero(@PathVariable Long idArtillero) {
        Artilleros artillero = artilleroRepository.findById(idArtillero).orElse(null);
        System.out.println(artillero.getNombres());
        if (artillero != null) {
            List<Artillero_Mantenimiento> artilleroMantenimientos = artilleroMantenimientosRepository.findByArtillero(artillero);
            List<MantenimientoPer> mantenimientos = artilleroMantenimientos.stream().map(Artillero_Mantenimiento::getMantenimientos).collect(Collectors.toList());
            return ResponseEntity.ok(mantenimientos);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
