package cafue.sisfu.repository;

import cafue.sisfu.entity.Artilleros;
import cafue.sisfu.entity.Despliegues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesplieguesRepository extends JpaRepository<Despliegues, Long> {
}