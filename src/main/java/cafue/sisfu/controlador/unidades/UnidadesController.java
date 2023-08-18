package cafue.sisfu.controlador.unidades;
import cafue.sisfu.entity.unidades.Unidad;
import cafue.sisfu.servicios.unidades.UnidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/unidades")
public class UnidadesController {

    private final UnidadesService unidadesService;

    @Autowired
    public UnidadesController(UnidadesService unidadesService) {
        this.unidadesService = unidadesService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated UnidadDTO unidadDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Unidad unidad = new Unidad();
        unidad.setNombreUnidad(unidadDTO.getNombre_unidad());
        unidad.setUbicacion(unidadDTO.getUbicacion());
        unidad.setTipo_unidad(unidadDTO.getTipo_unidad());

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return unidadesService.guardarUnidad(unidad);
    }


}
