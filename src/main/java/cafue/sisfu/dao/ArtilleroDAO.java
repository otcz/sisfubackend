package cafue.sisfu.dao;
import cafue.sisfu.entity.Artilleros;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ArtilleroDAO extends JpaRepository<Artilleros, Long> {
    List<Artilleros> findByNombres(String nombres);



}

