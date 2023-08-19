package cafue.sisfu.controlador.tiro.tiro_artillero;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.tiro.Tiro_Artillero;
import cafue.sisfu.repository.municion.MunicionRepository;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.tiro.TiroServicioRepository;
import cafue.sisfu.repository.unidades.UnidadesRepository;
import cafue.sisfu.servicios.tiro.TiroArtilleroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/tiroA")
public class TiroArtilleroController {

    private final TiroServicioRepository tiroServicioRepository;
    private final ArtilleroRepository artilleroRepository;
    private final TiroArtilleroService tiroArtilleroService;

    @Autowired
    public TiroArtilleroController(TiroServicioRepository tiroServicioRepository, ArtilleroRepository artilleroRepository, TiroArtilleroService tiroArtilleroService) {
        this.tiroServicioRepository = tiroServicioRepository;
        this.artilleroRepository = artilleroRepository;
        this.tiroArtilleroService = tiroArtilleroService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarMunicionSistema(@RequestBody @Validated TiroArtilleroControllerDTO unidadDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Tiro_Artillero tiroArtillero = new Tiro_Artillero();
        tiroArtillero.setIdTiroArtillero(unidadDTO.getIdTiroArtillero());

        Artilleros artillero = artilleroRepository.findArtillerosByIdArtillero(unidadDTO.getIdArtillero());
        Tiro tiro = tiroServicioRepository.findTiroByIdTiro(unidadDTO.getIdTiroArtillero());

        tiroArtillero.setArtilleros(artillero);
        tiroArtillero.setTiro(tiro);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return tiroArtilleroService.guardarTiroArtillero(tiroArtillero);
    }


}
