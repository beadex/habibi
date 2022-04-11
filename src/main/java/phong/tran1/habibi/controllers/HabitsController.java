package phong.tran1.habibi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import phong.tran1.habibi.dtos.HabitDTO;
import phong.tran1.habibi.models.ResponseObject;
import phong.tran1.habibi.services.HabitsService;

import java.util.List;

@RestController
@RequestMapping("/api/habits")
public class HabitsController {
    @Autowired
    HabitsService service;

    @GetMapping
    ResponseObject<List<HabitDTO>> getAllHabits() {
        return new ResponseObject<>(true, "Get all habits successfully!", service.getAllHabits());
    }
}
