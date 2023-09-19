package cafue.sisfu.controlador.personal.mantenimientoPer;

import cafue.sisfu.entity.personal.MantenimientoPer;
import cafue.sisfu.servicios.personal.MantenimientoPerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mantenimiento/artillero")
public class MantenimientoPerController {

    private final MantenimientoPerService mantenimientosService;


    @Autowired
    public MantenimientoPerController(MantenimientoPerService mantenimientosService) {
        this.mantenimientosService = mantenimientosService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated MantenimientoDTO mantenimientoDTO) {
        // Convertir UnidadDTO a entidad Unidad
        MantenimientoPer mantenimientos = new MantenimientoPer();
        mantenimientos.setIdMantenimientoPersonal(mantenimientoDTO.getIdMantenimientoPersonal());
        mantenimientos.setUnidad(mantenimientoDTO.getUnidad());
        mantenimientos.setFecha(mantenimientoDTO.getFecha());
        mantenimientos.setTipoFalla(mantenimientoDTO.getTipoFalla());
        mantenimientos.setSistema(mantenimientoDTO.getSistema());

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return mantenimientosService.guardarMantenimientosPersonal(mantenimientos);
    }


}
