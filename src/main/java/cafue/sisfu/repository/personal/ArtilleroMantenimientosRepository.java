package cafue.sisfu.repository.personal;

import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.entity.personal.Artillero_Mantenimiento;
import cafue.sisfu.entity.personal.Artilleros;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArtilleroMantenimientosRepository extends JpaRepository<Artillero_Mantenimiento, Long> {
    Artillero_Mantenimiento  findByIdArtilleroMantenimiento(Long id);
    List<Artillero_Mantenimiento> findByArtillero(Artilleros artillero);
}