package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
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

    public ResponseEntity<String> guardarArtillero(Artilleros artilleros) {
        try {
            // Agregar validaciones adicionales aquí
            if (artilleroRepository.existsByIdArtillero(artilleros.getIdArtillero())) {
                return new ResponseEntity<>("El artillero ya existe", HttpStatus.BAD_REQUEST);
            }

            // Guardar la unidad si pasa las validaciones
            artilleroRepository.save(artilleros);
            return new ResponseEntity<>("El sistema guardada exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            // Manejo de excepciones
            return new ResponseEntity<>("Error al guardar Artillero", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}


