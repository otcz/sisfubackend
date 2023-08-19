package cafue.sisfu.repository.tiro;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.tiro.Tiro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiroServicioRepository extends JpaRepository<Tiro, Long> {

    Tiro findTiroByIdTiro(Long idTiro);
}