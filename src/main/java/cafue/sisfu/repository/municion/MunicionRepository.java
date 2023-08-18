package cafue.sisfu.repository.municion;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.sistemas.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicionRepository extends JpaRepository<Municion, Long> {
}