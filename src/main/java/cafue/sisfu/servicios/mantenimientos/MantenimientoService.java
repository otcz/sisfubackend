package cafue.sisfu.servicios.mantenimientos;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.repository.mantenimiento.MantenimientoRepository;
import cafue.sisfu.repository.personal.MantenimientosRepository;
import cafue.sisfu.repository.sistemas.SistemaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientoService {
    private final MantenimientoRepository mantenimientoRepository;

    public MantenimientoService(MantenimientoRepository mantenimientoRepository) {
        this.mantenimientoRepository = mantenimientoRepository;
    }

    public ResponseEntity<String> guardarMantenimiento(Mantenimiento mantenimiento) {
        if (mantenimientoRepository.existsById(mantenimiento.getId_mantenimiento())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");


        } else {
            mantenimientoRepository.save(mantenimiento);
            return ResponseEntity.ok("Operación exitosa: Artillero guardado correctamente.");
        }
    }

    public Mantenimiento obtenerMantenimientoPorId(Long id) {
        return mantenimientoRepository.findById(id).orElse(null);
    }

    public List<Mantenimiento> findAll() {
        return mantenimientoRepository.findAll();
    }
}
