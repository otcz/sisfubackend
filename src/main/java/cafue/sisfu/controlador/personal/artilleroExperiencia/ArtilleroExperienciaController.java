package cafue.sisfu.controlador.personal.artilleroExperiencia;

import cafue.sisfu.entity.personal.*;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.ExperienciaRepository;
import cafue.sisfu.servicios.personal.ArtilleroExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/artillero/experiencia")
public class ArtilleroExperienciaController {

    private final ArtilleroExperienciaService artilleroDespliegueService;
    private final ExperienciaRepository desplieguesRepository;
    private final ArtilleroRepository artilleroRepository;

    @Autowired
    public ArtilleroExperienciaController(ArtilleroExperienciaService artilleroDespliegueService, ExperienciaRepository desplieguesRepository, ArtilleroRepository artilleroRepository) {
        this.artilleroDespliegueService = artilleroDespliegueService;
        this.desplieguesRepository = desplieguesRepository;
        this.artilleroRepository = artilleroRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroExperienciaDTO artilleroExperienciaDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artillero_Experiencia artilleroExperiencia = new Artillero_Experiencia();
        artilleroExperiencia.setIdArtilleroExperiencia(artilleroExperienciaDTO.getIdArtilleroExperiencia());

        Artilleros artilleros = artilleroRepository.findArtillerosByIdArtillero(artilleroExperienciaDTO.getIdArtillero());
        Experiencia experiencia = desplieguesRepository.findByIdExperiencia(artilleroExperienciaDTO.getIdExperiencia());

        artilleroExperiencia.setExperiencia(experiencia);
        artilleroExperiencia.setArtillero(artilleros);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artilleroDespliegueService.guardarArtilleroExperiencia(artilleroExperiencia);
    }


}
