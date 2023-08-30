package cafue.sisfu.repository.sistemas;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.unidades.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SistemaRepository extends JpaRepository<Sistema, Long> {
    boolean existsByNroSerie(String nroSerie);
    Sistema findByNroSerie(String nroSerie);

    List<Sistema> findByNombreUnidadAndTipoSistema(Unidad unidad, int tipoSistema);

}