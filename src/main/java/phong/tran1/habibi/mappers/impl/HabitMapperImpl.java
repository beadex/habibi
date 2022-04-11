package phong.tran1.habibi.mappers.impl;

import org.springframework.stereotype.Component;
import phong.tran1.habibi.dtos.HabitDTO;
import phong.tran1.habibi.entities.Habit;
import phong.tran1.habibi.mappers.HabitMapper;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HabitMapperImpl implements HabitMapper {
    @Override
    public HabitDTO toDTO(Habit habit) {
        return null;
    }

    @Override
    public List<HabitDTO> toListDTO(List<Habit> habits) {
        return habits.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
