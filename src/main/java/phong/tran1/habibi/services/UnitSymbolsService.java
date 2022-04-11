package phong.tran1.habibi.services;

import phong.tran1.habibi.dtos.UnitSymbolDTO;
import phong.tran1.habibi.entities.UnitSymbol;
import phong.tran1.habibi.enums.units.UnitType;

import java.util.List;

public interface UnitSymbolsService {
    List<UnitSymbolDTO> findAll();
    List<UnitSymbolDTO> findUnitsByType(UnitType type);

    UnitSymbolDTO findById(int id);
    UnitSymbolDTO findBySymbol(phong.tran1.habibi.enums.units.UnitSymbol symbol);

    void create(UnitSymbol unitSymbol);
    void update(UnitSymbol unitSymbol);
    void deleteById(int id);
    void deleteAll();
}
