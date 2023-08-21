package cafue.sisfu.servicios.personal;


import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.entity.personal.Mantenimientos;
import cafue.sisfu.repository.personal.MantenimientosRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientosService {
    private final MantenimientosRepository mantenimientosRepository;

    public MantenimientosService(MantenimientosRepository mantenimientosRepository) {
        this.mantenimientosRepository = mantenimientosRepository;
    }

    public ResponseEntity<String> guardarMantenimientosPersonal(Mantenimientos mantenimientos) {
        try {
            mantenimientosRepository.save(mantenimientos);
            return ResponseEntity.ok("Operación exitosa: mantenimiento guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: El mantenimiento ya existe.");
        }
    }



    public List<Mantenimientos> findAll() {
        return mantenimientosRepository.findAll();
    }
}
