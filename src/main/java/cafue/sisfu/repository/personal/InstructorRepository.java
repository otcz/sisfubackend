package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.personal.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    Instructor findByIdInstructor(Long idIntructor);
}