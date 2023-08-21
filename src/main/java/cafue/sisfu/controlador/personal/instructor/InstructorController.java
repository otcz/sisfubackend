package cafue.sisfu.controlador.personal.instructor;

import cafue.sisfu.entity.personal.Experiencia;
import cafue.sisfu.entity.personal.Instructor;
import cafue.sisfu.servicios.personal.ExperienciaService;
import cafue.sisfu.servicios.personal.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/instructor")
public class InstructorController {

    private final InstructorService instructorService;


    @Autowired
    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated InstructorDTO instructorDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Instructor instructor = new Instructor();
        instructor.setYear(instructorDTO.getYear());
        instructor.setMateria(instructorDTO.getMateria());

        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return instructorService.guardarInstructor(instructor);
    }


}
