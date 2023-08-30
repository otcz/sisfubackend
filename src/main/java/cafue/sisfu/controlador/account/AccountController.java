package cafue.sisfu.controlador.account;

import cafue.sisfu.entity.account.Account;
import cafue.sisfu.servicios.account.AccountService;
import cafue.sisfu.servicios.unidades.UnidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarUnidad(@RequestBody @Validated AccountDTO unidadDTO) {
        // Convertir UnidadDTO a entidad Unidad
        Account account = new Account();
        account.setPassword(unidadDTO.getPassword());
        account.setUser(unidadDTO.getUser());
        account.setId(unidadDTO.getId());
        account.setRol(unidadDTO.getRol());


        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return accountService.guardarUserPassword(account);
    }

    @GetMapping("/consultar/{user}")
    public ResponseEntity<AccountDTO> obtenerCuentaPorId(@PathVariable String user) {
        Account account = accountService.obtenerCuentaPorUser(user);
        if (account != null) {
            AccountDTO accountDTO = new AccountDTO();
            accountDTO.setId(account.getId());
            accountDTO.setUser(account.getUser());
            accountDTO.setPassword(account.getPassword());
            accountDTO.setRol(account.getRol());
            // Agregar otras propiedades de DTO si es necesario

            return ResponseEntity.ok(accountDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
