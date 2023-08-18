package cafue.sisfu.repository.mantenimiento;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MantenimientoRepository extends JpaRepository<Mantenimiento, Long> {
}