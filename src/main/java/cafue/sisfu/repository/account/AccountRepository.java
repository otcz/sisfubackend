package cafue.sisfu.repository.account;

import cafue.sisfu.entity.account.Account;
import cafue.sisfu.entity.sistemas.Sistema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByUser(String user);
    Account findById(int id);

    boolean existsByUser(String user);


}