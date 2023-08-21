package cafue.sisfu.controlador.personal.experiencia;

import cafue.sisfu.controlador.personal.artilleroCurso.ArtilleroCursoDTO;
import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Cursos;
import cafue.sisfu.entity.personal.Experiencia;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.CursosRepository;
import cafue.sisfu.servicios.personal.ArtilleroCursoService;
import cafue.sisfu.servicios.personal.ExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/experiencia")
public class ExperienciaController {

    private final ExperienciaService experienciaService;


    @Autowired
    public ExperienciaController(ExperienciaService experienciaService) {
        this.experienciaService = experienciaService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ExperienciaDTO experienciaDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Experiencia experiencia = new Experiencia();
        experiencia.setYear(experienciaDTO.getYear());
        experiencia.setUnidad(experienciaDTO.getUnidad());
        experiencia.setCarga(experienciaDTO.getCarga());
        experiencia.setSistema(experienciaDTO.getSistema());
        experiencia.setDistancia(experienciaDTO.getDistancia());
        experiencia.setUbicacion(experienciaDTO.getUbicacion());
        experiencia.setCantidadGranadas(experienciaDTO.getCantidadGranadas());



        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return experienciaService.guardarExperiencia(experiencia);
    }


}
