package cafue.sisfu.servicios.personal;


import cafue.sisfu.entity.personal.Certificaciones;
import cafue.sisfu.repository.personal.CertificacionesRepository;
import org.springframework.stereotype.Service;

@Service
public class CertificacionesService {
    private final CertificacionesRepository certificacionesRepository;

    public CertificacionesService(CertificacionesRepository artilleroRepository) {
        this.certificacionesRepository = artilleroRepository;
    }

    public void guardarCertificaciones(Certificaciones artillero) {
        certificacionesRepository.save(artillero);
    }


    public Certificaciones obtenerArtilleroPorId(Long id) {
        return certificacionesRepository.findById(id).orElse(null);
    }
}
