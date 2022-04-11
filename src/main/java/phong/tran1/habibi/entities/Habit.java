package phong.tran1.habibi.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import phong.tran1.habibi.enums.habits.HabitType;
import phong.tran1.habibi.enums.habits.TimeOfDay;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "habits")
@Getter
@Setter
public class Habit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @Column(name = "is_archived")
    private Boolean isArchived = false;

    @Column(name = "accent_color")
    private String accentColor = "#2AA8D0";

    private String regularly;

    @Column(name = "time_of_day")
    private TimeOfDay timeOfDay;

    @Column(name = "habit_type")
    private HabitType habitType;

    @Column(name = "habit_folder_id")
    private Integer habitFolderId = null;

    private Double priority;

    @Column(name = "priority_by_folder")
    private String priorityByFolder;

    @Column(name = "start_date")
    private Date startDate;

    @CreationTimestamp
    @Column(name = "created_at")
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;
}
