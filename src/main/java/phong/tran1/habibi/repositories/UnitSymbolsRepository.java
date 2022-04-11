package phong.tran1.habibi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phong.tran1.habibi.entities.UnitSymbol;
import phong.tran1.habibi.enums.units.UnitType;

import java.util.List;

@Repository
public interface UnitSymbolsRepository extends JpaRepository<UnitSymbol, Integer> {
    UnitSymbol findUnitBySymbol(phong.tran1.habibi.enums.units.UnitSymbol symbol);
    List<UnitSymbol> findUnitsByType(UnitType type);
}
