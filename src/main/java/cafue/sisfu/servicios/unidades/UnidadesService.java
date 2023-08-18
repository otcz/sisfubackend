package cafue.sisfu.servicios.unidades;

import cafue.sisfu.entity.unidades.Unidad;
import cafue.sisfu.repository.unidades.UnidadesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadesService {

    private final UnidadesRepository unidadesRepository;
    @Autowired
    public UnidadesService(UnidadesRepository unidadesRepository) {
        this.unidadesRepository = unidadesRepository;
    }

    public ResponseEntity<String> guardarUnidad(Unidad unidad) {
        try {
            // Agregar validaciones adicionales aquí
            if (unidadesRepository.existsByNombreUnidad(unidad.getNombreUnidad())) {
                return new ResponseEntity<>("El sistema ya existe", HttpStatus.BAD_REQUEST);
            }

            // Guardar la unidad si pasa las validaciones
            unidadesRepository.save(unidad);
            return new ResponseEntity<>("Sistema guardada exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            // Manejo de excepciones
            return new ResponseEntity<>("Error al guardar la sistema", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}





