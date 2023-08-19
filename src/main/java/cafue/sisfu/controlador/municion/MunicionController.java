package cafue.sisfu.controlador.municion;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.servicios.municion.MunicionService;
import cafue.sisfu.servicios.sistemas.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/municion")
public class MunicionController {


    private final MunicionService municionService;

    @Autowired
    public MunicionController(MunicionService municionService) {
        this.municionService = municionService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarMunicion(@RequestBody @Validated MunicionDTO municionDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Municion municion = new Municion();
        municion.setIdMunicion(municionDTO.getIdMunicion());
        municion.setLote(municionDTO.getLote());
        municion.setFecha_vence(municionDTO.getFechaVence());
        municion.setFecha_compra(municionDTO.getFechaCompra());
        municion.setUbicacion(municionDTO.getUbicacion());
        municion.setTipo_sistema(municionDTO.getTipoSistema());

        municion.setTipo_sistema(municionDTO.getTipoSistema());

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return municionService.guardarMunicion(municion);
    }


}
