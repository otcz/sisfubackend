package cafue.sisfu.controlador.personal.despliegues;

import cafue.sisfu.controlador.personal.artilleroCurso.ArtilleroCursoDTO;
import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Cursos;
import cafue.sisfu.entity.personal.Despliegues;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.CursosRepository;
import cafue.sisfu.servicios.personal.ArtilleroCursoService;
import cafue.sisfu.servicios.personal.DespliegueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/despliegues")
public class DespliegueController {


    private final DespliegueService despliegueService;

    @Autowired
    public DespliegueController(DespliegueService despliegueService) {
        this.despliegueService = despliegueService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated DespliegueDTO despliegueDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Despliegues despliegues = new Despliegues();
        despliegues.setIdDespliegues(despliegueDTO.getIdDespliegues());
        despliegues.setYear(despliegueDTO.getYear());
        despliegues.setUnidad(despliegueDTO.getUnidad());
        despliegues.setUbicacion(despliegueDTO.getUbicacion());
        despliegues.setNroSerie(despliegueDTO.getNroSerie());
        despliegues.setObservaciones(despliegueDTO.getObservaciones());


        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return despliegueService.guardarDespliegues(despliegues);
    }


}
