package cafue.sisfu.controlador;
import cafue.sisfu.entity.Artilleros;
import cafue.sisfu.dao.ArtilleroDAO;
import cafue.sisfu.entity.Certificaciones;
import cafue.sisfu.entity.Cursos;
import cafue.sisfu.servicios.ArtillerosService;
import cafue.sisfu.servicios.CertificacionesService;
import cafue.sisfu.servicios.CursosService;
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
