package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artillero_Mantenimiento;
import cafue.sisfu.repository.personal.ArtilleroMantenimientosRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtilleroMantenimientoService {
    private final ArtilleroMantenimientosRepository artilleroMantenimientoRepository;

    public ArtilleroMantenimientoService(ArtilleroMantenimientosRepository artilleroMantenimientoRepository) {
        this.artilleroMantenimientoRepository = artilleroMantenimientoRepository;
    }
    public ResponseEntity<String> guardarArtilleroMantenimientos(Artillero_Mantenimiento artilleroMantenimiento) {
        try {
            artilleroMantenimientoRepository.save(artilleroMantenimiento);
            return ResponseEntity.ok("Operación exitosa: artillero Mantenimiento guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: La artillero Mantenimiento ya existe.");
        }
    }

    public Artillero_Mantenimiento obtenerArtilleroExperienciaPorId(Long id) {
        return artilleroMantenimientoRepository.findById(id).orElse(null);
    }

    public List<Artillero_Mantenimiento> findAll() {
        return artilleroMantenimientoRepository.findAll();
    }
}

