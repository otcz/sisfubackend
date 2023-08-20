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

    public ResponseEntity<String> guardarDespliegues(Despliegues despliegues) {
        try {
            // Agregar validaciones adicionales aquí
            if (desplieguesRepository.existsByIdDespliegues(despliegues.getIdDespliegues())) {
                return new ResponseEntity<>("El despliegue ya existe", HttpStatus.BAD_REQUEST);
            }

            // Guardar la unidad si pasa las validaciones
            desplieguesRepository.save(despliegues);
            return new ResponseEntity<>("El despliegue guardada exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            // Manejo de excepciones
            return new ResponseEntity<>("Error al guardar despliegue", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    public List<Despliegues> findAll() {
        return desplieguesRepository.findAll();
    }
}
