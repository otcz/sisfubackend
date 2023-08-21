package cafue.sisfu.controlador.personal.artilleroMantenimiento;

import cafue.sisfu.entity.personal.Artillero_Mantenimiento;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Mantenimientos;
import cafue.sisfu.repository.personal.ArtilleroMantenimientosRepository;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.MantenimientosRepository;
import cafue.sisfu.servicios.personal.ArtilleroMantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/artillero/mantenimiento")
public class ArtilleroMantenimientoController {

    private final ArtilleroMantenimientoService artilleroMantenimientoService;
    private final MantenimientosRepository mantenimientosRepository;
    private final ArtilleroRepository artilleroRepository;

    @Autowired
    public ArtilleroMantenimientoController(ArtilleroMantenimientoService artilleroMantenimientoService, MantenimientosRepository mantenimientosRepository, ArtilleroRepository artilleroRepository){

        this.artilleroMantenimientoService = artilleroMantenimientoService;
        this.mantenimientosRepository = mantenimientosRepository;
        this.artilleroRepository = artilleroRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroMantenimientoDTO artilleroInstructorDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artillero_Mantenimiento artilleroMantenimiento = new Artillero_Mantenimiento();
        artilleroMantenimiento.setIdArtilleroMantenimiento(artilleroInstructorDTO.getIdArtilleroMantenimiento());
        artilleroMantenimiento.setYear(artilleroInstructorDTO.getYear());

        Artilleros artilleros = artilleroRepository.findArtillerosByIdArtillero(artilleroInstructorDTO.getIdArtillero());
        Mantenimientos mantenimientos = mantenimientosRepository.findByIdMantenimientoPersonal(artilleroInstructorDTO.getIdMantenimientoPersonal());

        artilleroMantenimiento.setMantenimientos(mantenimientos);
        artilleroMantenimiento.setArtillero(artilleros);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artilleroMantenimientoService.guardarArtilleroMantenimientos(artilleroMantenimiento);
    }


}
