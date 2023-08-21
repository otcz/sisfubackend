package cafue.sisfu.controlador.personal.mantenimiento;

import cafue.sisfu.entity.personal.Mantenimientos;
import cafue.sisfu.servicios.personal.MantenimientosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/mantenimiento/artillero")
public class MantenimientoArtilleroController {

    private final MantenimientosService mantenimientosService;


    @Autowired
    public MantenimientoArtilleroController(MantenimientosService mantenimientosService) {
        this.mantenimientosService = mantenimientosService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated MantenimientoDTO mantenimientoDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Mantenimientos mantenimientos = new Mantenimientos();
        mantenimientos.setIdMantenimientoPersonal(mantenimientoDTO.getIdMantenimientoPersonal());
        mantenimientos.setUnidad(mantenimientoDTO.getUnidad());
        mantenimientos.setFecha(mantenimientoDTO.getFecha());
        mantenimientos.setTipoFalla(mantenimientoDTO.getTipoFalla());
        mantenimientos.setSistema(mantenimientoDTO.getSistema());

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return mantenimientosService.guardarMantenimientosPersonal(mantenimientos);
    }


}
