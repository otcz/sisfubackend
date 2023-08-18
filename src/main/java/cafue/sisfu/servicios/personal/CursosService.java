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
        if (cursosRepository.existsById(cursos.getId_cursos())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            cursosRepository.save(cursos);
            return ResponseEntity.ok("Operación exitosa: Cursos guardado correctamente.");
        }
    }

    public List<Cursos> findAll() {
        return cursosRepository.findAll();
    }
}
