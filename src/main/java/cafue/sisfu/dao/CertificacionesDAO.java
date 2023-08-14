package cafue.sisfu.dao;

import cafue.sisfu.entity.Certificaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface CertificacionesDAO extends JpaRepository<Certificaciones, Long> {
    List<CertificacionesDAO> findByNombres(String nombres);

}

