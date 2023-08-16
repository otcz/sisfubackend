package cafue.sisfu.dao.personal;

import cafue.sisfu.entity.personal.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursosDAO extends JpaRepository<Cursos, Long> {
    List<Cursos> findByNombres(String nombres);



}

