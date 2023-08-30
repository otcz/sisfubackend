package cafue.sisfu.controlador.municion;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.servicios.municion.MunicionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        municion.setLote(municionDTO.getLote());
        municion.setFecha_vence(municionDTO.getFechaVence());
        municion.setFecha_compra(municionDTO.getFechaCompra());
        municion.setUbicacion(municionDTO.getUbicacion());
        municion.setTipo_sistema(municionDTO.getTipoSistema());
        municion.setCantidad(municionDTO.getCantidad());

        municion.setTipo_sistema(municionDTO.getTipoSistema());

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return municionService.guardarMunicion(municion);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Municion>> getMunicion() {
        List<Municion> municions = municionService.all();
        return ResponseEntity.ok(municions);
    }
    @GetMapping("/cout")
    public ResponseEntity<Integer> getMunicionSize() {
        int count = municionService.cout();
        return ResponseEntity.ok(count);
    }

    @GetMapping("/suma")
    public ResponseEntity<Long> sumCantidadPorTipoSistema(@RequestParam Long tipoSistema) {
        Long sumaCantidad = municionService.sumCantidadPorTipoSistema(tipoSistema);
        return ResponseEntity.ok(sumaCantidad);
    }
}
