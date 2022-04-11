package phong.tran1.habibi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phong.tran1.habibi.entities.Habit;

@Repository
public interface HabitsRepository extends JpaRepository<Habit, Integer> {
}
