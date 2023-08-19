package cafue.sisfu.repository.sistemas;

import cafue.sisfu.entity.sistemas.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SistemaRepository extends JpaRepository<Sistema, Long> {
    boolean existsByNroSerie(String nroSerie);
    Sistema findByNroSerie(String nroSerie);
}