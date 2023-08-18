package cafue.sisfu.repository.municion;

import cafue.sisfu.entity.municion.Municion_Sistemas;
import cafue.sisfu.entity.sistemas.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicionSistemaRepository extends JpaRepository<Municion_Sistemas, Long> {
}