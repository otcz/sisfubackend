package cafue.sisfu.controlador.personal.artilleroInstructor;

import cafue.sisfu.entity.personal.*;
import cafue.sisfu.repository.personal.ArtilleroRepository;
import cafue.sisfu.repository.personal.InstructorRepository;
import cafue.sisfu.servicios.personal.ArtilleroInstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/artillero/instructor")
public class ArtilleroInstructorController {

    private final ArtilleroInstructorService artilleroInstructorService;
    private final InstructorRepository desplieguesRepository;
    private final ArtilleroRepository artilleroRepository;

    @Autowired
    public ArtilleroInstructorController(ArtilleroInstructorService artilleroDespliegueService, InstructorRepository desplieguesRepository, ArtilleroRepository artilleroRepository) {

        this.artilleroInstructorService = artilleroDespliegueService;
        this.desplieguesRepository = desplieguesRepository;
        this.artilleroRepository = artilleroRepository;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated ArtilleroInstructorDTO artilleroInstructorDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Artillero_Instructor artilleroInstructor = new Artillero_Instructor();
        artilleroInstructor.setIdArtilleroInstructor(artilleroInstructorDTO.getIdArtilleroInstructor());
        artilleroInstructor.setYear(artilleroInstructorDTO.getYear());

        Artilleros artilleros = artilleroRepository.findArtillerosByIdArtillero(artilleroInstructorDTO.getIdArtillero());
        Instructor instructor = desplieguesRepository.findByIdInstructor(artilleroInstructorDTO.getIdInstructor());

        artilleroInstructor.setInstructor(instructor);
        artilleroInstructor.setArtillero(artilleros);

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return artilleroInstructorService.guardarArtilleroInstructor(artilleroInstructor);
    }


}
