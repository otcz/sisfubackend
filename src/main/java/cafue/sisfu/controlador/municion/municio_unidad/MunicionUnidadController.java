package cafue.sisfu.controlador.municion.municio_unidad;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.municion.Municion_Unidad;
import cafue.sisfu.entity.unidades.Unidad;
import cafue.sisfu.repository.municion.MunicionRepository;
import cafue.sisfu.repository.unidades.UnidadesRepository;
import cafue.sisfu.servicios.municion.MunicionUnidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/municionU")
public class MunicionUnidadController {

    private final MunicionRepository municionRepository;
    private final UnidadesRepository unidadesRepository;
    private final MunicionUnidadService municionUnidadService;

    @Autowired
    public MunicionUnidadController(MunicionRepository municionRepository, UnidadesRepository unidadesRepository, MunicionUnidadService municionUnidadService) {
        this.municionRepository = municionRepository;
        this.unidadesRepository = unidadesRepository;

        this.municionUnidadService = municionUnidadService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarMunicionSistema(@RequestBody @Validated MunicionUnidadControllerDTO unidadDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Municion_Unidad municion_sistemas = new Municion_Unidad();
        municion_sistemas.setIdmunicionunidad(unidadDTO.getIdMunicionUnidad());

        Unidad unidad = unidadesRepository.findByNombreUnidad(unidadDTO.getNombreUnidad());
        Municion municion = municionRepository.findByIdMunicion(unidadDTO.getIdMunicion());

        municion_sistemas.setUnidad(unidad);
        municion_sistemas.setMunicion(municion);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return municionUnidadService.guardarMunicionUnidad(municion_sistemas);
    }


}
