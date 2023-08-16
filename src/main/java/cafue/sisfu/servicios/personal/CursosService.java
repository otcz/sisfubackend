package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Cursos;
import cafue.sisfu.repository.personal.CursosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursosService {
    private final CursosRepository cursosRepository;

    public CursosService(CursosRepository cursosRepository) {
        this.cursosRepository = cursosRepository;
    }

    public void guardarCursos(Cursos cursos) {
        cursosRepository.save(cursos);
    }

    public Cursos obtenerCrusosoPorId(Long id) {
        return cursosRepository.findById(id).orElse(null);
    }

    public List<Cursos> findAll() {
        return cursosRepository.findAll();
    }
}
