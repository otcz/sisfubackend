package cafue.sisfu.servicios.personal;


import cafue.sisfu.entity.personal.Mantenimientos;
import cafue.sisfu.repository.personal.MantenimientosRepository;
import org.springframework.stereotype.Service;

@Service
public class MantenimientosService {
    private final MantenimientosRepository mantenimientosRepository;

    public MantenimientosService(MantenimientosRepository mantenimientosRepository) {
        this.mantenimientosRepository = mantenimientosRepository;
    }

    public void guardarCertificaciones(Mantenimientos mantenimientos) {
        mantenimientosRepository.save(mantenimientos);
    }


    public Mantenimientos obtenerArtilleroPorId(Long id) {
        return mantenimientosRepository.findById(id).orElse(null);
    }
}
