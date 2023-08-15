package cafue.sisfu.servicios;


import cafue.sisfu.entity.Certificaciones;
import cafue.sisfu.entity.Mantenimientos;
import cafue.sisfu.repository.CertificacionesRepository;
import cafue.sisfu.repository.MantenimientosRepository;
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
