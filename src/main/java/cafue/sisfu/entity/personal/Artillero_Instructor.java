package cafue.sisfu.entity.personal;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "artillero_instructor")
public class Artillero_Instructor {
    @Id
    @Getter
    @Setter
    @NotNull
    @Column(name = "id_artillero_instructor")
    private Long id_artillero_instructor;


    @Getter
    @Setter
    @NotNull
    @Column(name = "year")
    private int year;

    @ManyToOne
    @JoinColumn(name = "id_artillero")
    private Artilleros artillero;

    @ManyToOne
    @JoinColumn(name = "id_instructor")
    private Instructor instructor;
}
