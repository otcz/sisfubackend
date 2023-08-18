package cafue.sisfu.servicios.municion;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.repository.mantenimiento.MantenimientoRepository;
import cafue.sisfu.repository.municion.MunicionRepository;
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
        if (municionRepository.existsById(municion.getId_municion())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");


        } else {
            municionRepository.save(municion);
            return ResponseEntity.ok("Operación exitosa: Artillero guardado correctamente.");
        }
    }

    public Municion obtenerMantenimientoPorId(Long id) {
        return municionRepository.findById(id).orElse(null);
    }

    public List<Municion> findAll() {
        return municionRepository.findAll();
    }
}
