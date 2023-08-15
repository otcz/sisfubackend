package cafue.sisfu.dao;

import cafue.sisfu.entity.Certificaciones;
import cafue.sisfu.entity.Mantenimientos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface MantenimientoDAO extends JpaRepository<Mantenimientos, Long> {


}

