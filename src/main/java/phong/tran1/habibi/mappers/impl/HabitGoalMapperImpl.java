package phong.tran1.habibi.mappers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import phong.tran1.habibi.dtos.GoalDTO;
import phong.tran1.habibi.entities.HabitGoal;
import phong.tran1.habibi.mappers.HabitGoalMapper;
import phong.tran1.habibi.mappers.UnitSymbolMapper;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HabitGoalMapperImpl implements HabitGoalMapper {
    @Autowired
    UnitSymbolMapper unitSymbolMapper;

    @Override
    public GoalDTO toDTO(HabitGoal goal) {
        var unitSymbolDTO = unitSymbolMapper.toDTO(goal.getUnitSymbol());

        return new GoalDTO(goal.getId(), goal.getPeriodicity().value, goal.getValue(), unitSymbolDTO, goal.getCreatedAt(), goal.getUpdatedAt());
    }

    @Override
    public List<GoalDTO> toListDTO(List<HabitGoal> goals) {
        return goals.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
