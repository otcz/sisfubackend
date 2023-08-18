package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.entity.personal.Artillero_Despliegues;
import cafue.sisfu.repository.personal.ArtilleroCursoRepository;
import cafue.sisfu.repository.personal.ArtilleroDesplieguesRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtilleroDespliegueService {
    private final ArtilleroDesplieguesRepository artilleroDesplieguesRepository;

    public ArtilleroDespliegueService(ArtilleroDesplieguesRepository artilleroDesplieguesRepository) {
        this.artilleroDesplieguesRepository = artilleroDesplieguesRepository;
    }
    public ResponseEntity<String> guardarArtilleroDespliegues(Artillero_Despliegues artilleroDespliegues) {
        if (artilleroDesplieguesRepository.existsById(artilleroDespliegues.getId_artillero_despliegues())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            artilleroDesplieguesRepository.save(artilleroDespliegues);
            return ResponseEntity.ok("Operación exitosa: artillero Despliegues guardado correctamente.");
        }
    }

    public Artillero_Despliegues obtenerArtilleroDesplieguesPorId(Long id) {
        return artilleroDesplieguesRepository.findById(id).orElse(null);
    }

    public List<Artillero_Despliegues> findAll() {
        return artilleroDesplieguesRepository.findAll();
    }
}

