package phong.tran1.habibi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phong.tran1.habibi.dtos.UnitSymbolDTO;
import phong.tran1.habibi.entities.UnitSymbol;
import phong.tran1.habibi.enums.units.UnitType;
import phong.tran1.habibi.mappers.UnitSymbolMapper;
import phong.tran1.habibi.repositories.UnitSymbolsRepository;
import phong.tran1.habibi.services.UnitSymbolsService;

import java.util.List;

@Service
public class UnitSymbolsServiceImpl implements UnitSymbolsService {
    @Autowired
    UnitSymbolsRepository repository;

    @Autowired
    UnitSymbolMapper mapper;

    @Override
    public List<UnitSymbolDTO> findAll() {
        return mapper.toListDTO(repository.findAll());
    }

    @Override
    public List<UnitSymbolDTO> findUnitsByType(UnitType type) {
        return mapper.toListDTO(repository.findUnitsByType(type));
    }

    @Override
    public UnitSymbolDTO findById(int id) {
        var unitSymbol = repository.findById(id);
        return mapper.toDTO(unitSymbol.orElse(null));
    }

    @Override
    public UnitSymbolDTO findBySymbol(phong.tran1.habibi.enums.units.UnitSymbol symbol) {
        return mapper.toDTO(repository.findUnitBySymbol(symbol));
    }

    @Override
    public void create(UnitSymbol unitSymbol) {
        repository.save(unitSymbol);
    }

    @Override
    public void update(UnitSymbol unitSymbol) {
        var oldUnitSymbol = repository.findById(unitSymbol.getId()).orElse(null);
        if (oldUnitSymbol != null) {
            oldUnitSymbol.setName(unitSymbol.getName());
            oldUnitSymbol.setDisplay(unitSymbol.getDisplay());
            oldUnitSymbol.setType(unitSymbol.getType());
            oldUnitSymbol.setSymbol(unitSymbol.getSymbol());
            oldUnitSymbol.setAlpha(unitSymbol.getAlpha());
            repository.save(oldUnitSymbol);
        }
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
}
