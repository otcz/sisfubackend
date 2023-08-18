package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artillero_Despliegues;
import cafue.sisfu.entity.personal.Artillero_Experiencia;
import cafue.sisfu.repository.personal.ArtilleroDesplieguesRepository;
import cafue.sisfu.repository.personal.ArtilleroExperienciaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtilleroExperienciaService {
    private final ArtilleroExperienciaRepository artilleroExperienciaRepository;

    public ArtilleroExperienciaService(ArtilleroExperienciaRepository artilleroExperienciaRepository) {
        this.artilleroExperienciaRepository = artilleroExperienciaRepository;
    }
    public ResponseEntity<String> guardarArtilleroExperiencia(Artillero_Experiencia artilleroExperiencia) {
        if (artilleroExperienciaRepository.existsById(artilleroExperiencia.getId_artillero_experiencia())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            artilleroExperienciaRepository.save(artilleroExperiencia);
            return ResponseEntity.ok("Operación exitosa: artillero Experiencia guardado correctamente.");
        }
    }

    public Artillero_Experiencia obtenerArtilleroExperienciaPorId(Long id) {
        return artilleroExperienciaRepository.findById(id).orElse(null);
    }

    public List<Artillero_Experiencia> findAll() {
        return artilleroExperienciaRepository.findAll();
    }
}

