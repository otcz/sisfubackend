package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.unidades.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtilleroRepository extends JpaRepository<Artilleros, Long> {
    boolean existsByIdArtillero(Long id_artillero);

    Artilleros findArtillerosByIdArtillero(Long idArtillero);

    List<Artilleros> findByUnidad(Unidad unidad);

    List<Artilleros> getArtillerosBy();

    int countAllBy();
}
