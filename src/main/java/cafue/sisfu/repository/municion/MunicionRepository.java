package cafue.sisfu.repository.municion;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MunicionRepository extends JpaRepository<Municion, Long> {
    Municion findByIdMunicion(Long idMunicion);

    List<Municion> getMunicionBy();
    boolean findByLote(String lote);
    int countAllBy();

    @Query("SELECT SUM(m.cantidad) FROM Municion m WHERE m.tipo_sistema = :tipoSistema")
    Long sumCantidadByTipoSistema(@Param("tipoSistema") Long tipo);

}