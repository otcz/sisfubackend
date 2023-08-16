package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Despliegues;
import cafue.sisfu.repository.personal.DesplieguesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespliegueService {
    private final DesplieguesRepository desplieguesRepository;

    public DespliegueService(DesplieguesRepository desplieguesRepository) {
        this.desplieguesRepository = desplieguesRepository;
    }

    public void guardarDespliegues(Despliegues despliegues) {
        desplieguesRepository.save(despliegues);
    }

    public Despliegues obtenerDespleguesPorId(Long id) {
        return desplieguesRepository.findById(id).orElse(null);
    }

    public List<Despliegues> findAll() {
        return desplieguesRepository.findAll();
    }
}
