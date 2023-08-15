package cafue.sisfu.repository;

import cafue.sisfu.entity.Artilleros;
import cafue.sisfu.entity.Mantenimientos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MantenimientosRepository extends JpaRepository<Mantenimientos, Long> {
}