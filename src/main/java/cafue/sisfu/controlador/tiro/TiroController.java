package cafue.sisfu.controlador.tiro;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.servicios.municion.MunicionService;
import cafue.sisfu.servicios.tiro.TiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/tiro")
public class TiroController {


    private final TiroService tiroService;

    @Autowired
    public TiroController(TiroService tiroService) {
        this.tiroService = tiroService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarMunicion(@RequestBody @Validated TiroDTO tiroDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Tiro tiro = new Tiro();
        tiro.setIdTiro(tiroDTO.getIdTiro());
        tiro.setDistancia(tiroDTO.getDistancia());
        tiro.setCarga(tiroDTO.getCarga());
        tiro.setCantidadGranada(tiroDTO.getCantidadGranada());
        tiro.setUbicacion(tiroDTO.getUbicacion());

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return tiroService.guardarTiro(tiro);
    }


}
