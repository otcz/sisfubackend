package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.entity.personal.Cursos;
import cafue.sisfu.repository.personal.CertificacionesRepository;
import cafue.sisfu.repository.personal.CursosRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosService {
    private final CursosRepository cursosRepository;


    public CursosService(CursosRepository cursosRepository) {
        this.cursosRepository = cursosRepository;
    }

    public ResponseEntity<String> guardarCursos(Cursos cursos) {
        try {
            // Agregar validaciones adicionales aquí
            if (cursosRepository.existsByIdCursos(cursos.getIdCursos())) {
                return new ResponseEntity<>("El cursos ya existe", HttpStatus.BAD_REQUEST);
            }

            // Guardar la unidad si pasa las validaciones
            cursosRepository.save(cursos);
            return new ResponseEntity<>("El cursos guardada exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            // Manejo de excepciones
            return new ResponseEntity<>("Error al guardar cursos", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public List<Cursos> findAll() {
        return cursosRepository.findAll();
    }
}
