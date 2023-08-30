package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.entity.personal.Cursos;
import cafue.sisfu.repository.personal.CertificacionesRepository;
import cafue.sisfu.repository.personal.CursosRepository;
import org.springframework.dao.DataIntegrityViolationException;
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
            cursosRepository.save(cursos);
            return ResponseEntity.ok("Operación exitosa: cursos guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: El cursos ya existe.");
        }
    }

    public List<Cursos> findAll() {
        return cursosRepository.findAll();
    }
}
