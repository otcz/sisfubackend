package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artillero_Certificacion;
import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.repository.personal.ArtilleroCertificacionRepository;
import cafue.sisfu.repository.personal.ArtilleroCursoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtilleroCursoService {
    private final ArtilleroCursoRepository artilleroCursoRepository;

    public ArtilleroCursoService(ArtilleroCursoRepository artilleroCursoRepository) {
        this.artilleroCursoRepository = artilleroCursoRepository;
    }

    public ResponseEntity<String> guardarArtilleroCurso(Artillero_Curso artilleroCurso) {
        if (artilleroCursoRepository.existsById(artilleroCurso.getIdArtilleroCurso())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");


        } else {
            artilleroCursoRepository.save(artilleroCurso);
            return ResponseEntity.ok("Operación exitosa: artillero Curso guardado correctamente.");
        }
    }

    public Artillero_Curso obtenerArtilleroPorId(Long id) {
        return artilleroCursoRepository.findById(id).orElse(null);
    }

    public List<Artillero_Curso> findAll() {
        return artilleroCursoRepository.findAll();
    }
}
