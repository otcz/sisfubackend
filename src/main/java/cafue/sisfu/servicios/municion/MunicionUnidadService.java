package cafue.sisfu.servicios.municion;

import cafue.sisfu.entity.mantenimientos.Mantenimiento;
import cafue.sisfu.entity.municion.Municion_Unidad;
import cafue.sisfu.repository.mantenimiento.MantenimientoRepository;
import cafue.sisfu.repository.municion.MunicionUnidadRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MunicionUnidadService {
    private final MunicionUnidadRepository municionUnidadRepository;

    public MunicionUnidadService(MunicionUnidadRepository municionUnidadRepository) {
        this.municionUnidadRepository = municionUnidadRepository;
    }

    public ResponseEntity<String> guardarMunicionUnidad(Municion_Unidad municion_unidad) {
        if (municionUnidadRepository.existsById(municion_unidad.getIdmunicionunidad())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");


        } else {
            municionUnidadRepository.save(municion_unidad);
            return ResponseEntity.ok("Operación exitosa: Artillero guardado correctamente.");
        }
    }

    public Municion_Unidad obtenerMantenimientoPorId(Long id) {
        return municionUnidadRepository.findById(id).orElse(null);
    }

    public List<Municion_Unidad> findAll() {
        return municionUnidadRepository.findAll();
    }
}
