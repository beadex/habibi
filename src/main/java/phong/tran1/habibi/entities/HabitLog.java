package phong.tran1.habibi.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import phong.tran1.habibi.enums.units.UnitSymbol;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "habit_logs")
@Getter
@Setter
public class HabitLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Integer value;

    @Column(name = "unit_symbol_id")
    private Integer unitSymbolId;

    @Column(name = "habit_id")
    private Integer habitId;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;
}
