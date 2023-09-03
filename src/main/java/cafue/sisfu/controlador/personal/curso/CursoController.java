package cafue.sisfu.controlador.personal.curso;

import cafue.sisfu.entity.personal.Cursos;
import cafue.sisfu.servicios.personal.CursosService;
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

    private final CursosService cursosRepository;



    @Autowired
    public CursoController(CursosService cursosRepository) {

        this.cursosRepository = cursosRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated CursoDTO cursoDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Cursos cursos = new Cursos();
        cursos.setNombres(cursoDTO.getNombres());
        cursos.setValorCurso(cursoDTO.getValor());
        cursos.setSigla(cursoDTO.getSigla());
        cursos.setCosto(cursoDTO.getCosto());

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return cursosRepository.guardarCursos(cursos);
    }


}
