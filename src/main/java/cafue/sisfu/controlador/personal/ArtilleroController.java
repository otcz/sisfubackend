package cafue.sisfu.controlador.personal;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.servicios.personal.ArtillerosService;
import cafue.sisfu.servicios.sistemas.SistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/Artillero")
public class ArtilleroController {

    private final ArtillerosService artillerosService;

    @Autowired
    public ArtilleroController(ArtillerosService artillerosService) {
        this.artillerosService = artillerosService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroDTO artilleroDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artilleros artilleros = new Artilleros();
        artilleros.setIdArtillero(artilleroDTO.getId_artillero());
        artilleros.setNombres(artilleroDTO.getNombres());


        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artillerosService.guardarArtillero(artilleros);
    }


}
