package cafue.sisfu.servicios;

import cafue.sisfu.entity.Cursos;
import cafue.sisfu.entity.Instructor;
import cafue.sisfu.repository.CursosRepository;
import cafue.sisfu.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {
    private final InstructorRepository instructorRepository;

    public InstructorService(InstructorRepository instructorRepository) {
        this.instructorRepository = instructorRepository;
    }

    public void guardarInstructor(Instructor instructor) {
        instructorRepository.save(instructor);
    }

    public Instructor obtenerInstructorPorId(Long id) {
        return instructorRepository.findById(id).orElse(null);
    }

    public List<Instructor> findAll() {
        return instructorRepository.findAll();
    }
}
