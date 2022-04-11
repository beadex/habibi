package phong.tran1.habibi.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HabitDTO {
    private Integer id;
    private String name;
    private Boolean isArchived;
    private String accentColor;
    private String regularly;
    private GoalDTO currentGoal;
    private String timeOfDay;
    private String habitType;
    private Integer habitFolderId;
    private Double priority;
    private String priorityByFolder;
    private Date startDate;
    private Date createdAt;
    private Date updatedAt;
}
