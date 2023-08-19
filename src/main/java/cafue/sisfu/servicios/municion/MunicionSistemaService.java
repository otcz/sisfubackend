package cafue.sisfu.servicios.municion;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.municion.Municion;
import cafue.sisfu.entity.municion.Municion_Sistemas;
import cafue.sisfu.repository.mantenimiento.MantenimientoRepository;
import cafue.sisfu.repository.municion.MunicionSistemaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicionSistemaService {
    private final MunicionSistemaRepository municionSistemaRepository;

    public MunicionSistemaService(MunicionSistemaRepository municionSistemaRepository) {
        this.municionSistemaRepository = municionSistemaRepository;
    }

    public ResponseEntity<String> guardarMunicionSistema(Municion_Sistemas municion_sistemas) {
        if (municionSistemaRepository.existsById(municion_sistemas.getIdMunicionSistemas())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");


        } else {
            municionSistemaRepository.save(municion_sistemas);
            return ResponseEntity.ok("Operación exitosa: Artillero guardado correctamente.");
        }
    }

    public Municion_Sistemas obtenerMantenimientoPorId(Long id) {
        return municionSistemaRepository.findById(id).orElse(null);
    }

    public List<Municion_Sistemas> findAll() {
        return municionSistemaRepository.findAll();
    }
}
