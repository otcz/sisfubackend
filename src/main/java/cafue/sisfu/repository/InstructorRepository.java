package cafue.sisfu.repository;

import cafue.sisfu.entity.Despliegues;
import cafue.sisfu.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}