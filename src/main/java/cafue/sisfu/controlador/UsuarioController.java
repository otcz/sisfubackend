package cafue.sisfu.controlador;
import cafue.sisfu.entity.*;
import cafue.sisfu.dao.ArtilleroDAO;
import cafue.sisfu.servicios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @Autowired
    private ArtillerosService artillerosService;

    @Autowired
    private CertificacionesService certificacionesService;

    @Autowired
    private CursosService cursosService;

    @Autowired
    private DespliegueService despliegueService;

    @Autowired
    private ExperienciaService experienciaService;

    @Autowired
    private InstructorService instructorService;

    @Autowired
    private MantenimientosService mantenimientosService;
    @RequestMapping(value = "save/artillero", method = RequestMethod.POST)
    public ResponseEntity<String> saveArtillero(@RequestBody Artilleros artillero) {
        artillerosService.guardarArtillero(artillero);
        return new ResponseEntity<>("Operación exitosa", HttpStatus.OK);
    }

    @RequestMapping(value = "save/certificacion", method = RequestMethod.POST)
    public ResponseEntity<String> saveCertificacion(@RequestBody Certificaciones certificaciones) {
        certificacionesService.guardarCertificaciones(certificaciones);
        return new ResponseEntity<>("Operación exitosa", HttpStatus.OK);
    }

    @RequestMapping(value = "save/cursos", method = RequestMethod.POST)
    public ResponseEntity<String> saveCursos(@RequestBody Cursos cursos) {
        cursosService.guardarCursos(cursos);
        return new ResponseEntity<>("Operación exitosa", HttpStatus.OK);
    }

    @RequestMapping(value = "save/despliegues", method = RequestMethod.POST)
    public ResponseEntity<String> saveDespliegues(@RequestBody Despliegues despliegues) {
        despliegueService.guardarDespliegues(despliegues);
        return new ResponseEntity<>("Operación exitosa", HttpStatus.OK);
    }

    @RequestMapping(value = "save/experiencia", method = RequestMethod.POST)
    public ResponseEntity<String> saveExperiencia(@RequestBody Experiencia experiencia) {
        experienciaService.guardarExperiencia(experiencia);
        return new ResponseEntity<>("Operación experiencia", HttpStatus.OK);
    }

    @RequestMapping(value = "save/instructor", method = RequestMethod.POST)
    public ResponseEntity<String> saveInstructor(@RequestBody Instructor instructor) {
        instructorService.guardarInstructor(instructor);
        return new ResponseEntity<>("Operación instructor", HttpStatus.OK);
    }

    @RequestMapping(value = "save/mantenimientos", method = RequestMethod.POST)
    public ResponseEntity<String> saveInstructor(@RequestBody Mantenimientos mantenimientos) {
        mantenimientosService.guardarCertificaciones(mantenimientos);
        return new ResponseEntity<>("Operación mantenimientos", HttpStatus.OK);
    }



    @GetMapping("usuarios/{id}")
    public ResponseEntity<Artilleros> obtenerUsuarioPorId(@PathVariable Long id) {
        Artilleros artillero = artillerosService.obtenerArtilleroPorId(id);
        if (artillero != null) {
            return ResponseEntity.ok(artillero);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/artilleros")
    public List<Artilleros> obtenerArtilleros() {
        return artillerosService.findAll();
    }

}
