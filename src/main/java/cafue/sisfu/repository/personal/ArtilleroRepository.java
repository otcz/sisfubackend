package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.personal.Artilleros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtilleroRepository extends JpaRepository<Artilleros, Long> {
    boolean existsByIdArtillero(Long id_artillero);
    Artilleros findArtillerosByIdArtillero(Long idArtillero);
}
