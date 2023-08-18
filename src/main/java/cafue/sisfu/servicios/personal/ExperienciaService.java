package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.entity.personal.Experiencia;
import cafue.sisfu.repository.personal.ExperienciaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepository;

    public ExperienciaService(ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }

    public ResponseEntity<String> guardarCertificaciones(Experiencia experiencia) {
        if (experienciaRepository.existsById(experiencia.getId_experiencia())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            experienciaRepository.save(experiencia);
            return ResponseEntity.ok("Operación exitosa: experiencia guardado correctamente.");
        }
    }



    public List<Experiencia> findAll() {
        return experienciaRepository.findAll();
    }
}
