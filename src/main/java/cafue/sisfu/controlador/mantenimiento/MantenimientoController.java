package cafue.sisfu.controlador.mantenimiento;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.repository.sistemas.SistemaRepository;
import cafue.sisfu.servicios.mantenimientos.MantenimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/mantenimiento")
public class MantenimientoController {

    private final MantenimientoService mantenimientoService;
    private final SistemaRepository sistemaRepository;

    @Autowired
    public MantenimientoController(MantenimientoService mantenimientoService, SistemaRepository sistemaRepository) {
        this.mantenimientoService = mantenimientoService;
        this.sistemaRepository = sistemaRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated MantenimientoDTO mantenimientoDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Mantenimiento mantenimiento = new Mantenimiento();
        mantenimiento.setIdMantenimiento(mantenimientoDTO.getIdMantenimiento());
        mantenimiento.setUnidadRealizaMantenimiento(mantenimientoDTO.getUnidadRealizaMantenimiento());
        mantenimiento.setFecha(mantenimientoDTO.getFecha());

        Sistema sistema= sistemaRepository.findByNroSerie(mantenimientoDTO.getNroSerie());
        mantenimiento.setSistema(sistema);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return mantenimientoService.guardarMantenimiento(mantenimiento);
    }


}
