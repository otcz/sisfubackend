package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.personal.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
    Experiencia findByIdExperiencia(Long idExperiencia);
}