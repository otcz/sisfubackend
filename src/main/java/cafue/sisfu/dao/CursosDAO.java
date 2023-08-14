package cafue.sisfu.dao;

import cafue.sisfu.entity.Artilleros;
import cafue.sisfu.entity.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursosDAO extends JpaRepository<Cursos, Long> {
    List<CertificacionesDAO> findByNombres(String nombres);



}

