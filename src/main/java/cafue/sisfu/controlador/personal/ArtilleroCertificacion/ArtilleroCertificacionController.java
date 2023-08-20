package cafue.sisfu.controlador.personal.ArtilleroCertificacion;

import cafue.sisfu.entity.personal.Artillero_Certificacion;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.CertificacionesRepository;
import cafue.sisfu.servicios.personal.ArtilleroCertificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/certificaciones/artillero")
public class ArtilleroCertificacionController {

    private final ArtilleroCertificacionesService artilleroCertificacionesService;
    private final ArtilleroRepository artilleroRepository;
    private final CertificacionesRepository certificacionesRepository;

    @Autowired
    public ArtilleroCertificacionController(ArtilleroCertificacionesService artilleroCertificacionesService, ArtilleroRepository artilleroRepository, CertificacionesRepository certificacionesRepository) {
        this.artilleroCertificacionesService = artilleroCertificacionesService;
        this.artilleroRepository = artilleroRepository;
        this.certificacionesRepository = certificacionesRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarArtilleroCertificacion(@RequestBody @Validated ArtilleroCertificacionDTO artilleroCertificacionDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artillero_Certificacion artilleroCertificacion = new Artillero_Certificacion();


        artilleroCertificacion.setIdArtilleroCertificacion(artilleroCertificacionDTO.getIdArtilleroCertificacion());
        Artilleros artilleros=artilleroRepository.findArtillerosByIdArtillero(artilleroCertificacionDTO.getIdArtillero());
        Certificaciones certificaciones = certificacionesRepository.getById(artilleroCertificacionDTO.getIdCertificaciones());
        artilleroCertificacion.setArtilleros(artilleros);
        artilleroCertificacion.setCertificaciones(certificaciones);


        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artilleroCertificacionesService.guardarArtilleroCertificacion(artilleroCertificacion);
    }


}
