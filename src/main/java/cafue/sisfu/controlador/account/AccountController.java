package cafue.sisfu.controlador.account;

import cafue.sisfu.entity.account.Account;
import cafue.sisfu.servicios.account.AccountService;
import cafue.sisfu.servicios.unidades.UnidadesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


        // Agregar validaciones adicionales y manejo de excepciones si es necesario
        return accountService.guardarUserPassword(account);
    }


}