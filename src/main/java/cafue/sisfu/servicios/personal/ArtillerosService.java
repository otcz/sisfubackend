package cafue.sisfu.servicios.personal;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtillerosService {
    private final ArtilleroRepository artilleroRepository;

    public ArtillerosService(ArtilleroRepository artilleroRepository) {
        this.artilleroRepository = artilleroRepository;
    }

    public void guardarArtillero(Artilleros artillero) {
        artilleroRepository.save(artillero);
    }

    public Artilleros obtenerArtilleroPorId(Long id) {
        return artilleroRepository.findById(id).orElse(null);
    }

    public List<Artilleros> findAll() {
        return artilleroRepository.findAll();
    }
}
