package cafue.sisfu.servicios.sistemas;

import cafue.sisfu.repository.sistemas.SistemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SistemaService {
    private final SistemaRepository sistemaRepository;

    public SistemaService(SistemaRepository sistemaRepository) {
        this.sistemaRepository = sistemaRepository;
    }

    public void guardarSistema(Sistema sistema) {
        sistemaRepository.save(sistema);
    }

    public Sistema obtenerArtilleroPorId(Long id) {
        return sistemaRepository.findById(id).orElse(null);
    }

    public List<Sistema> findAll() {
        return sistemaRepository.findAll();
    }
}
