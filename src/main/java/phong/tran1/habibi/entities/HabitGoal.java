package phong.tran1.habibi.entities;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import phong.tran1.habibi.enums.goals.Periodicity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity(name = "habit_goals")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class HabitGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Periodicity periodicity;

    private Integer value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "habit_id")
    @ToString.Exclude
    private Habit habit;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "unit_symbol_id")
    @ToString.Exclude
    private UnitSymbol unitSymbol;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        HabitGoal habitGoal = (HabitGoal) o;
        return id != null && Objects.equals(id, habitGoal.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
