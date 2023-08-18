package cafue.sisfu.repository.municion;

import cafue.sisfu.entity.municion.Municion_Unidad;
import cafue.sisfu.entity.sistemas.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicionUnidadRepository extends JpaRepository<Municion_Unidad, Long> {
}