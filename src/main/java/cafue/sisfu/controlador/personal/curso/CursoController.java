package cafue.sisfu.controlador.personal.curso;

import cafue.sisfu.controlador.personal.artilleroCurso.ArtilleroCursoDTO;
import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Cursos;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.CursosRepository;
import cafue.sisfu.servicios.personal.ArtilleroCursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cursos/artilleros")
public class CursoController {

    private final ArtilleroCursoService artilleroCursoService;

    private final ArtilleroRepository artilleroRepository;

    private final CursosRepository cursosRepository;

    @Autowired
    public CursoController(ArtilleroCursoService artilleroCursoService, ArtilleroRepository artilleroRepository, CursosRepository cursosRepository) {
        this.artilleroCursoService = artilleroCursoService;
        this.artilleroRepository = artilleroRepository;
        this.cursosRepository = cursosRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroCursoDTO artilleroCursoDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artillero_Curso artilleroCurso = new Artillero_Curso();
        artilleroCurso.setIdArtilleroCurso(artilleroCursoDTO.getIdCursos());
        artilleroCurso.setYear(artilleroCursoDTO.getYear());

        Artilleros artilleros = artilleroRepository.findArtillerosByIdArtillero(artilleroCursoDTO.getIdArtillero());
        Cursos cursos = cursosRepository.findCursosByIdCursos(artilleroCursoDTO.getIdCursos());

        artilleroCurso.setArtillero(artilleros);
        artilleroCurso.setCursos(cursos);
        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artilleroCursoService.guardarArtilleroCurso(artilleroCurso);
    }


}
