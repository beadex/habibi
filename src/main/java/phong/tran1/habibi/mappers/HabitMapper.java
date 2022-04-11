package phong.tran1.habibi.mappers;

import phong.tran1.habibi.dtos.HabitDTO;
import phong.tran1.habibi.entities.Habit;
import phong.tran1.habibi.entities.HabitGoal;

import java.util.List;

public interface HabitMapper {
    HabitDTO toDTO(Habit habit);
    List<HabitDTO> toListDTO(List<Habit> habits);
}
