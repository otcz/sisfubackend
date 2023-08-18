package cafue.sisfu.servicios.personal;


import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.repository.personal.CertificacionesRepository;
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
        if (certificacionesRepository.existsById(certificaciones.getId_certificaciones())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            certificacionesRepository.save(certificaciones);
            return ResponseEntity.ok("Operación exitosa: certificaciones guardado correctamente.");
        }
    }



    public List<Certificaciones> findAll() {
        return certificacionesRepository.findAll();
    }
}
