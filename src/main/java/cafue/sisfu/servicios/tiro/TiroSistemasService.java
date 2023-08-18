package cafue.sisfu.servicios.tiro;

import cafue.sisfu.entity.tiro.Tiro;
import cafue.sisfu.entity.tiro.Tiro_Sistemas;
import cafue.sisfu.repository.tiro.TiroServicioRepository;
import cafue.sisfu.repository.tiro.TiroSistemasRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TiroSistemasService {
    private final TiroSistemasRepository tiroSistemasRepository;

    public TiroSistemasService(TiroSistemasRepository tiroSistemasRepository) {
        this.tiroSistemasRepository = tiroSistemasRepository;
    }

    public ResponseEntity<String> guardarTiroSistemas(Tiro_Sistemas tiro_sistemas) {
        if (tiroSistemasRepository.existsById(tiro_sistemas.getId_tiro_sistemas())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ERROR");
        } else {
            tiroSistemasRepository.save(tiro_sistemas);
            return ResponseEntity.ok("Operación exitosa: tiro guardado correctamente.");
        }
    }

    public Tiro_Sistemas obtenerTiroSistemaPorId(Long id) {
        return tiroSistemasRepository.findById(id).orElse(null);
    }

    public List<Tiro_Sistemas> findAll() {
        return tiroSistemasRepository.findAll();
    }
}
