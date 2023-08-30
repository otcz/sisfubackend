package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.entity.personal.Artilleros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtilleroCursoRepository extends JpaRepository<Artillero_Curso, Long> {

    List<Artillero_Curso> findByArtillero(Artilleros artillero);
}