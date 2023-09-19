package cafue.sisfu.servicios.mantenimientos;

import cafue.sisfu.entity.mantenimientoSistema.MantenimientoSistema;
import cafue.sisfu.repository.mantenimientoSistema.MantenimientoSistemaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientoSistemaService {
    private final MantenimientoSistemaRepository mantenimientoRepository;

    public MantenimientoSistemaService(MantenimientoSistemaRepository mantenimientoRepository) {
        this.mantenimientoRepository = mantenimientoRepository;
    }

    public ResponseEntity<String> guardarMantenimiento(MantenimientoSistema mantenimiento) {
        if (mantenimientoRepository.existsById(mantenimiento.getIdMantenimiento())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");


        } else {
            mantenimientoRepository.save(mantenimiento);
            return ResponseEntity.ok("Operación exitosa: Artillero guardado correctamente.");
        }
    }

    public MantenimientoSistema obtenerMantenimientoPorId(Long id) {
        return mantenimientoRepository.findById(id).orElse(null);
    }

    public List<MantenimientoSistema> findAll() {
        return mantenimientoRepository.findAll();
    }
}
