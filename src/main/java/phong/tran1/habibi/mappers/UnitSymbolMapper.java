package phong.tran1.habibi.mappers;

import phong.tran1.habibi.dtos.UnitSymbolDTO;
import phong.tran1.habibi.entities.UnitSymbol;

import java.util.List;

public interface UnitSymbolMapper {
    UnitSymbolDTO toDTO(UnitSymbol unitSymbol);
    List<UnitSymbolDTO> toListDTO(List<UnitSymbol> unitSymbols);
}
