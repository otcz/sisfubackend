package cafue.sisfu.servicios.tiro;

import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.tiro.Tiro_Artillero;
import cafue.sisfu.repository.tiro.TiroArtilleroRepository;
import cafue.sisfu.repository.tiro.TiroServicioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiroArtilleroService {
    private final TiroArtilleroRepository tiroArtilleroRepository;

    public TiroArtilleroService(TiroArtilleroRepository tiroArtilleroRepository) {
        this.tiroArtilleroRepository = tiroArtilleroRepository;
    }

    public ResponseEntity<String> guardarTiroArtillero(Tiro_Artillero tiroArtillero) {
        if (tiroArtilleroRepository.existsById(tiroArtillero.getId_tiro_artillero())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            tiroArtilleroRepository.save(tiroArtillero);
            return ResponseEntity.ok("Operación exitosa: tiro Artillero guardado correctamente.");
        }
    }

    public Tiro_Artillero obtenerTiroArtilleroPorId(Long id) {
        return tiroArtilleroRepository.findById(id).orElse(null);
    }

    public List<Tiro_Artillero> findAll() {
        return tiroArtilleroRepository.findAll();
    }
}
