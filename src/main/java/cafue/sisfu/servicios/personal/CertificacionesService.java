package cafue.sisfu.servicios.personal;


import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.repository.personal.CertificacionesRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificacionesService {
    private final CertificacionesRepository certificacionesRepository;

    public CertificacionesService(CertificacionesRepository artilleroRepository) {
        this.certificacionesRepository = artilleroRepository;
    }
    public ResponseEntity<String> guardarCertificaciones(Certificaciones certificaciones) {
        try {
            certificacionesRepository.save(certificaciones);
            return ResponseEntity.ok("Operación exitosa: certificaciones guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: La certificación ya existe.");
        }
    }




    public List<Certificaciones> findAll() {
        return certificacionesRepository.findAll();
    }
}
