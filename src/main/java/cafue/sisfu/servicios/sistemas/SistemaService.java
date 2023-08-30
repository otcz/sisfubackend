package cafue.sisfu.servicios.sistemas;

import cafue.sisfu.entity.personal.Artilleros;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.entity.unidades.Unidad;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.sistemas.SistemaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SistemaService {
    private final SistemaRepository sistemaRepository;

    private final ArtilleroRepository artilleroRepository;

    public SistemaService(SistemaRepository sistemaRepository, ArtilleroRepository artilleroRepository) {
        this.sistemaRepository = sistemaRepository;
        this.artilleroRepository = artilleroRepository;
    }

    public ResponseEntity<String> sistemaUnidades(Sistema sistema) {
        try {
            // Agregar validaciones adicionales aquí
            if (sistemaRepository.existsByNroSerie(sistema.getNroSerie())) {
                return new ResponseEntity<>("El sistema ya existe", HttpStatus.BAD_REQUEST);
            }

            // Guardar la unidad si pasa las validaciones
            sistemaRepository.save(sistema);
            return new ResponseEntity<>("El sistema guardada exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            // Manejo de excepciones
            return new ResponseEntity<>("Error al guardar el Sistema", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public List<Sistema> getSistemasPorUnidad(Unidad unidad,int tipoSistema) {
        return sistemaRepository.findByNombreUnidadAndTipoSistema(unidad,tipoSistema);
    }


}





