package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.entity.personal.Instructor;
import cafue.sisfu.repository.personal.InstructorRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {
    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public ResponseEntity<String> guardarInstructor(Instructor instructor) {
        try {
            instructorRepository.save(instructor);
            return ResponseEntity.ok("Operación exitosa: instructor guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: El instructor ya existe.");
        }
    }



    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }
}
