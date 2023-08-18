package cafue.sisfu.repository.tiro;

import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro_Artillero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiroArtilleroRepository extends JpaRepository<Tiro_Artillero, Long> {
}