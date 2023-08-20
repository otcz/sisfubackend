package cafue.sisfu.controlador.personal.certificacion;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.servicios.personal.ArtillerosService;
import cafue.sisfu.servicios.personal.CertificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/certificaciones")
public class CertificacionController {

    private final CertificacionesService certificacionesService;

    @Autowired
    public CertificacionController(CertificacionesService certificacionesService) {
        this.certificacionesService = certificacionesService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated CertificacionDTO certificacionDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Certificaciones certificaciones = new Certificaciones();
        certificaciones.setIdCertificaciones(certificacionDTO.getIdCertificaciones());
        certificaciones.setNombre(certificacionDTO.getNombre());
        certificaciones.setQuienCertifica(certificacionDTO.getQuienCertifica());


        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return certificacionesService.guardarCertificaciones(certificaciones);
    }


}
