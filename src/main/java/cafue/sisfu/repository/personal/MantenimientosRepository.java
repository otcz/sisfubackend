package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.personal.Mantenimientos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MantenimientosRepository extends JpaRepository<Mantenimientos, Long> {
    Mantenimientos findByIdMantenimientoPersonal(Long id);
}