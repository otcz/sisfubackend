package cafue.sisfu.repository.tiro;

import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.tiro.Tiro_Sistemas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TiroSistemasRepository extends JpaRepository<Tiro_Sistemas, Long> {
}