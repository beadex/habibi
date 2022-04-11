package phong.tran1.habibi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phong.tran1.habibi.dtos.HabitDTO;
import phong.tran1.habibi.entities.Habit;
import phong.tran1.habibi.mappers.HabitMapper;
import phong.tran1.habibi.repositories.HabitsRepository;
import phong.tran1.habibi.services.HabitsService;

import java.util.List;

@Service
public class HabitsServiceImpl implements HabitsService {
    @Autowired
    HabitsRepository repository;

    @Autowired
    HabitMapper mapper;

    @Override
    public List<HabitDTO> getAllHabits() {

        return null;
    }

    @Override
    public HabitDTO getHabitById(int id) {
        return mapper.toDTO(repository.findById(id).orElse(null));
    }

    @Override
    public void create(Habit habit) {

    }
}
