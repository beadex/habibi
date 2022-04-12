package phong.tran1.habibi.mappers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phong.tran1.habibi.dtos.HabitDTO;
import phong.tran1.habibi.dtos.HabitFolderDTO;
import phong.tran1.habibi.entities.Habit;
import phong.tran1.habibi.mappers.HabitFoldersMapper;
import phong.tran1.habibi.mappers.HabitGoalMapper;
import phong.tran1.habibi.mappers.HabitMapper;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HabitMapperImpl implements HabitMapper {
    @Autowired
    HabitGoalMapper goalMapper;

    @Autowired
    HabitFoldersMapper foldersMapper;

    @Override
    public HabitDTO toDTO(Habit habit) {
        var goals = goalMapper.toListDTO(habit.getGoals());
        HabitFolderDTO folder = null;
        if (habit.getHabitFolder() != null) {
            folder = foldersMapper.toDTO(habit.getHabitFolder());
        }
        return new HabitDTO(habit.getId(), habit.getName(), habit.getIsArchived(), habit.getAccentColor(), goals, habit.getRegularly(), habit.getTimeOfDay().value, habit.getHabitType().value, folder, habit.getPriority(), habit.getPriorityByFolder(), habit.getStartDate(), habit.getCreatedAt(), habit.getUpdatedAt());
    }

    @Override
    public List<HabitDTO> toListDTO(List<Habit> habits) {
        return habits.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
