package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.entity.personal.Despliegues;
import cafue.sisfu.repository.personal.DesplieguesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespliegueService {
    private final DesplieguesRepository desplieguesRepository;

    public DespliegueService(DesplieguesRepository desplieguesRepository) {
        this.desplieguesRepository = desplieguesRepository;
    }

    public ResponseEntity<String> guardarCertificaciones(Despliegues despliegues) {
        if (desplieguesRepository.existsById(despliegues.getId_despliegues())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            desplieguesRepository.save(despliegues);
            return ResponseEntity.ok("Operación exitosa: despliegues guardado correctamente.");
        }
    }



    public List<Despliegues> findAll() {
        return desplieguesRepository.findAll();
    }
}
