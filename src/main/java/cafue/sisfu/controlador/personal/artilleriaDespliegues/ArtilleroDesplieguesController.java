package cafue.sisfu.controlador.personal.artilleriaDespliegues;

import cafue.sisfu.entity.personal.Artillero_Despliegues;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Despliegues;
import cafue.sisfu.repository.personal.ArtilleroDesplieguesRepository;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.DesplieguesRepository;
import cafue.sisfu.servicios.personal.ArtilleroDespliegueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/artillero/despliegue")
public class ArtilleroDesplieguesController {

    private final ArtilleroDespliegueService artilleroDespliegueService;
    private final DesplieguesRepository desplieguesRepository;

    private final ArtilleroRepository artilleroRepository;

    @Autowired
    public ArtilleroDesplieguesController(ArtilleroDespliegueService artilleroDespliegueService, DesplieguesRepository desplieguesRepository, ArtilleroRepository artilleroRepository) {
        this.artilleroDespliegueService = artilleroDespliegueService;
        this.desplieguesRepository = desplieguesRepository;
        this.artilleroRepository = artilleroRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroDesplieguesDTO artilleroDesplieguesDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artillero_Despliegues artilleroDespliegues = new Artillero_Despliegues();
        artilleroDespliegues.setIdArtilleroDespliegues(artilleroDesplieguesDTO.getIdDespliegues());

        Artilleros artilleros = artilleroRepository.findArtillerosByIdArtillero(artilleroDesplieguesDTO.getIdArtillero());
        Despliegues despliegues = desplieguesRepository.findDesplieguesByIdDespliegues(artilleroDesplieguesDTO.getIdDespliegues());

        artilleroDespliegues.setDespliegues(despliegues);
        artilleroDespliegues.setArtillero(artilleros);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artilleroDespliegueService.guardarArtilleroDespliegues(artilleroDespliegues);
    }


}
