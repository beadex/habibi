package phong.tran1.habibi.mappers.impl;

import org.springframework.stereotype.Component;
import phong.tran1.habibi.dtos.UnitSymbolDTO;
import phong.tran1.habibi.entities.UnitSymbol;
import phong.tran1.habibi.mappers.UnitSymbolMapper;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UnitSymbolMapperImpl implements UnitSymbolMapper {
    @Override
    public UnitSymbolDTO toDTO(UnitSymbol unitSymbol) {
        return new UnitSymbolDTO(unitSymbol.getId(), unitSymbol.getName(), unitSymbol.getDisplay(), unitSymbol.getSymbol().value, unitSymbol.getType().value, unitSymbol.getAlpha().value);
    }

    @Override
    public List<UnitSymbolDTO> toListDTO(List<UnitSymbol> unitSymbols) {
        return unitSymbols.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
