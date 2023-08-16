package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Experiencia;
import cafue.sisfu.repository.personal.ExperienciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienciaService {
    private final ExperienciaRepository experienciaRepository;

    public ExperienciaService(ExperienciaRepository experienciaRepository) {
        this.experienciaRepository = experienciaRepository;
    }

    public void guardarExperiencia(Experiencia experiencia) {
        experienciaRepository.save(experiencia);
    }

    public Experiencia obtenerArtilleroPorId(Long id) {
        return experienciaRepository.findById(id).orElse(null);
    }

    public List<Experiencia> findAll() {
        return experienciaRepository.findAll();
    }
}
