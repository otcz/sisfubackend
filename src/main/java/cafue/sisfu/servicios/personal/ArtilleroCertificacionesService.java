package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artillero_Certificacion;
import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.repository.personal.ArtilleroCertificacionRepository;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtilleroCertificacionesService {
    private final ArtilleroCertificacionRepository artilleroCertificacionRepository;

    public ArtilleroCertificacionesService(ArtilleroCertificacionRepository artilleroCertificacionRepository) {
        this.artilleroCertificacionRepository = artilleroCertificacionRepository;
    }

    public ResponseEntity<String> guardarArtilleroCertificacion(Artillero_Certificacion artilleroCertificacion) {
        try {
            artilleroCertificacionRepository.save(artilleroCertificacion);
            return ResponseEntity.ok("Operación exitosa: certificaciones guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: La certificación ya existe.");
        }
    }


    public Artillero_Certificacion obtenerArtilleroPorId(Long id) {
        return artilleroCertificacionRepository.findById(id).orElse(null);
    }

    public List<Artillero_Certificacion> findAll() {
        return artilleroCertificacionRepository.findAll();
    }
}
