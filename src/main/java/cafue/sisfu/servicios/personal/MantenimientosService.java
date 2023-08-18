package cafue.sisfu.servicios.personal;


import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.entity.personal.Mantenimientos;
import cafue.sisfu.repository.personal.MantenimientosRepository;
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
        if (mantenimientosRepository.existsById(mantenimientos.getId_mantenimiento_personal())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            mantenimientosRepository.save(mantenimientos);
            return ResponseEntity.ok("Operación exitosa: mantenimientos guardado correctamente.");
        }
    }



    public List<Mantenimientos> findAll() {
        return mantenimientosRepository.findAll();
    }
}
