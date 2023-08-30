package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artillero_Certificacion;
import cafue.sisfu.entity.personal.Artillero_Curso;
import cafue.sisfu.repository.personal.ArtilleroCertificacionRepository;
import cafue.sisfu.repository.personal.ArtilleroCursoRepository;
import cafue.sisfu.repository.personal.CursosRepository;
import org.springframework.dao.DataIntegrityViolationException;
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
        try {
            artilleroCursoRepository.save(artilleroCurso);
            return ResponseEntity.ok("Operación exitosa: artilleroCurso guardado correctamente.");
        } catch (DataIntegrityViolationException ex) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR: El artilleroCurso ya existe.");
        }
    }

    public Artillero_Curso obtenerArtilleroPorId(Long id) {
        return artilleroCursoRepository.findById(id).orElse(null);
    }

    public List<Artillero_Curso> findAll() {
        return artilleroCursoRepository.findAll();
    }
}
