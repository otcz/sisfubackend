package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.personal.MantenimientoPer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MantenimientosPerRepository extends JpaRepository<MantenimientoPer, Long> {
    MantenimientoPer findByIdMantenimientoPersonal(Long id);
}