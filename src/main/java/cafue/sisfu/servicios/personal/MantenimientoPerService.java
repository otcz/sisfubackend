package cafue.sisfu.servicios.personal;


import cafue.sisfu.entity.personal.MantenimientoPer;
import cafue.sisfu.repository.personal.MantenimientosPerRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientoPerService {
    private final MantenimientosPerRepository mantenimientosRepository;

    public MantenimientoPerService(MantenimientosPerRepository mantenimientosRepository) {
        this.mantenimientosRepository = mantenimientosRepository;
    }

    public ResponseEntity<String> guardarMantenimientosPersonal(MantenimientoPer mantenimientos) {
        try {
            mantenimientosRepository.save(mantenimientos);
            return ResponseEntity.ok("Operación exitosa: mantenimiento guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: El mantenimiento ya existe.");
        }
    }



    public List<MantenimientoPer> findAll() {
        return mantenimientosRepository.findAll();
    }
}
