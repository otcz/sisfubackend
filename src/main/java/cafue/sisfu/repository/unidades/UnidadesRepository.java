package cafue.sisfu.repository.unidades;

import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.unidades.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UnidadesRepository extends JpaRepository<Unidad, Long> {
    boolean existsByNombreUnidad(String nombreUnidad);
}