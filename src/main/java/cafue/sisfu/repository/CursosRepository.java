package cafue.sisfu.repository;

import cafue.sisfu.entity.Artilleros;
import cafue.sisfu.entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosRepository extends JpaRepository<Cursos, Long> {
}