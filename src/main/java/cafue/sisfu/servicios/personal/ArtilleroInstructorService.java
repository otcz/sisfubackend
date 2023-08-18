package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artillero_Experiencia;
import cafue.sisfu.entity.personal.Artillero_Instructor;
import cafue.sisfu.repository.personal.ArtilleroExperienciaRepository;
import cafue.sisfu.repository.personal.ArtilleroInstructorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtilleroInstructorService {
    private final ArtilleroInstructorRepository artilleroInstructorRepository;

    public ArtilleroInstructorService(ArtilleroInstructorRepository artilleroInstructorRepository) {
        this.artilleroInstructorRepository = artilleroInstructorRepository;
    }
    public ResponseEntity<String> guardarArtilleroInstructor(Artillero_Instructor artilleroInstructorInstructor) {
        if (artilleroInstructorRepository.existsById(artilleroInstructorInstructor.getId_artillero_instructor())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            artilleroInstructorRepository.save(artilleroInstructorInstructor);
            return ResponseEntity.ok("Operación exitosa: artillero Instructor guardado correctamente.");
        }
    }

    public Artillero_Instructor obtenerArtilleroExperienciaPorId(Long id) {
        return artilleroInstructorRepository.findById(id).orElse(null);
    }

    public List<Artillero_Instructor> findAll() {
        return artilleroInstructorRepository.findAll();
    }
}

