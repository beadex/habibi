package phong.tran1.habibi.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import phong.tran1.habibi.enums.goals.Periodicity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "habit_goals")
@Getter
@Setter
public class HabitGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Periodicity periodicity;

    private Integer value;

    @Column(name = "habit_id")
    private Integer habitId;

    @Column(name = "unit_symbol_id")
    private Integer unitSymbolId;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;
}
