package cafue.sisfu.servicios.account;

import cafue.sisfu.entity.account.Account;
import cafue.sisfu.entity.sistemas.Sistema;
import cafue.sisfu.repository.account.AccountRepository;
import cafue.sisfu.repository.sistemas.SistemaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public ResponseEntity<String> guardarUserPassword(Account account) {
        try {
            // Agregar validaciones adicionales aquí
            if (accountRepository.existsByUser(account.getUser())) {
                return new ResponseEntity<>("User ya existe", HttpStatus.BAD_REQUEST);
            }

            // Guardar la unidad si pasa las validaciones
            accountRepository.save(account);
            return new ResponseEntity<>("El User guardado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            // Manejo de excepciones
            return new ResponseEntity<>("Error al guardar el User", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    public Account obtenerCuentaPorUser(String user) {
        return accountRepository.findByUser(user);
    }
}





