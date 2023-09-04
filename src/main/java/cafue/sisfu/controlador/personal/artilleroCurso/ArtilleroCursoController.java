package cafue.sisfu.controlador.personal.artilleroCurso;

import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Cursos;
import cafue.sisfu.repository.personal.ArtilleroCursoRepository;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.CursosRepository;
import cafue.sisfu.servicios.personal.ArtilleroCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/cursos")
public class ArtilleroCursoController {

    private final ArtilleroCursoService artilleroCursoService;
    private final ArtilleroRepository artilleroRepository;
    private final CursosRepository cursosRepository;

    private final ArtilleroCursoRepository artilleroCursoRepository;

    @Autowired
    public ArtilleroCursoController(ArtilleroCursoService artilleroCursoService, ArtilleroRepository artilleroRepository, CursosRepository cursosRepository, ArtilleroCursoRepository artilleroCursoRepository) {
        this.artilleroCursoService = artilleroCursoService;
        this.artilleroRepository = artilleroRepository;
        this.cursosRepository = cursosRepository;
        this.artilleroCursoRepository = artilleroCursoRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroCursoDTO artilleroCursoDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artillero_Curso artilleroCurso = new Artillero_Curso();
        artilleroCurso.setYear(artilleroCursoDTO.getYear());
        Artilleros artilleros = artilleroRepository.findArtillerosByIdArtillero(artilleroCursoDTO.getId_artillero());
        artilleroCurso.setArtillero(artilleroRepository.findArtillerosByIdArtillero(artilleroCursoDTO.getId_artillero()));
        artilleroCurso.setCursos(cursosRepository.findCursosByIdCursos(artilleroCursoDTO.getId_cursos()));

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artilleroCursoService.guardarArtilleroCurso(artilleroCurso);
    }

    @GetMapping("/artillero/{idArtillero}/cursos")
    public ResponseEntity<List<Cursos>> getCursosRealizadosPorArtillero(@PathVariable Long idArtillero) {
        Artilleros artillero = artilleroRepository.findById(idArtillero).orElse(null);

        if (artillero != null) {
            List<Artillero_Curso> artilleroCursos = artilleroCursoRepository.findByArtillero(artillero);
            List<Cursos> cursosRealizados = artilleroCursos.stream().map(Artillero_Curso::getCursos).collect(Collectors.toList());
            return ResponseEntity.ok(cursosRealizados);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
