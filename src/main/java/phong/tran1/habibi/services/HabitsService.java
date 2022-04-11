package phong.tran1.habibi.services;

import phong.tran1.habibi.dtos.HabitDTO;
import phong.tran1.habibi.entities.Habit;

import java.util.List;

public interface HabitsService {
    List<HabitDTO> getAllHabits();
    HabitDTO getHabitById(int id);

    void create(Habit habit);
}
