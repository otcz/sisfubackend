package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtillerosService {
    private final ArtilleroRepository artilleroRepository;

    public ArtillerosService(ArtilleroRepository artilleroRepository) {
        this.artilleroRepository = artilleroRepository;
    }

    public ResponseEntity<String> guardarArtillero(Artilleros artillero) {
        if (artilleroRepository.existsById(artillero.getId_artillero())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");


        } else {
            artilleroRepository.save(artillero);
            return ResponseEntity.ok("Operación exitosa: Artillero guardado correctamente.");

        }
    }

    public Artilleros obtenerArtilleroPorId(Long id) {
        return artilleroRepository.findById(id).orElse(null);
    }

    public List<Artilleros> findAll() {
        return artilleroRepository.findAll();
    }
}
