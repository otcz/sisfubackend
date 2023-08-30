package cafue.sisfu.servicios.municion;

import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.repository.municion.MunicionRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MunicionService {
    private final MunicionRepository municionRepository;

    public MunicionService(MunicionRepository municionRepository) {
        this.municionRepository = municionRepository;
    }

    public ResponseEntity<String> guardarMunicion(Municion municion) {
        try {
            municionRepository.save(municion);
            return ResponseEntity.ok("Operación exitosa: certificaciones guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: La certificación ya existe.");
        }
    }

    public Municion obtenerMantenimientoPorId(Long id) {
        return municionRepository.findById(id).orElse(null);
    }

    public List<Municion> findAll() {
        return municionRepository.findAll();
    }

    public List<Municion> all() {
        return municionRepository.getMunicionBy();
    }

    public int cout() {
        return municionRepository.countAllBy();
    }

    public Long sumCantidadPorTipoSistema(Long tipoSistema) {
        return municionRepository.sumCantidadByTipoSistema(tipoSistema);
    }
}
