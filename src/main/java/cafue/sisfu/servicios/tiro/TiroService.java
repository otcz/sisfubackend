package cafue.sisfu.servicios.tiro;

import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.repository.tiro.TiroServicioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiroService {
    private final TiroServicioRepository tiroRepository;

    public TiroService(TiroServicioRepository tiroRepository) {
        this.tiroRepository = tiroRepository;
    }

    public ResponseEntity<String> guardarTiro(Tiro tiro) {
        if (tiroRepository.existsById(tiro.getIdTiro())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            tiroRepository.save(tiro);
            return ResponseEntity.ok("Operación exitosa: tiro guardado correctamente.");
        }
    }

    public Tiro obtenerTiroPorId(Long id) {
        return tiroRepository.findById(id).orElse(null);
    }

    public List<Tiro> findAll() {
        return tiroRepository.findAll();
    }
}
