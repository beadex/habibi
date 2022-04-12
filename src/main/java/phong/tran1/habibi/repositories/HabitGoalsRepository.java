package phong.tran1.habibi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import phong.tran1.habibi.entities.HabitGoal;

import java.util.Optional;

@Repository
public interface HabitGoalsRepository extends JpaRepository<HabitGoal, Integer> {
    @Query("SELECT hg FROM habit_goals hg INNER JOIN unit_symbols us ON hg.unitSymbol.id = us.id WHERE hg.id = :id")
    Optional<HabitGoal> findGoalWithUnitSymbolById(@Param("id") Integer id);
}
