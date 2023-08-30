package cafue.sisfu.entity.account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id")
    private int id;


    @Getter
    @Setter
    @NotNull
    @Column(name = "user")
    private String user;

    @Getter
    @Setter
    @NotNull
    @Column(name = "password")
    private String password;

    @Getter
    @Setter
    @NotNull
    @Column(name = "rol")
    private String rol;



}
