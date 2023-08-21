package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.personal.Despliegues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesplieguesRepository extends JpaRepository<Despliegues, Long> {

    boolean existsByIdDespliegues(Long idDespliegues);
    Despliegues findDesplieguesByIdDespliegues(long idDespliegue);
}