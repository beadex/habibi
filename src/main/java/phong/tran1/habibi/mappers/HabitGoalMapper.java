package phong.tran1.habibi.mappers;

import org.springframework.stereotype.Component;
import phong.tran1.habibi.dtos.GoalDTO;
import phong.tran1.habibi.entities.HabitGoal;

import java.util.List;

@Component
public interface HabitGoalMapper {
    GoalDTO toDTO(HabitGoal goal);
    List<GoalDTO> toListDTO(List<HabitGoal> goals);
}
