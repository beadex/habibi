package phong.tran1.habibi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import phong.tran1.habibi.dtos.UnitSymbolDTO;
import phong.tran1.habibi.entities.UnitSymbol;
import phong.tran1.habibi.enums.units.UnitType;
import phong.tran1.habibi.models.ResponseObject;
import phong.tran1.habibi.services.UnitSymbolsService;

import java.util.List;

@RestController
@RequestMapping("/api/units")
public class UnitSymbolsController {
    @Autowired
    UnitSymbolsService service;

    @GetMapping
    @ResponseBody
    ResponseObject<List<UnitSymbolDTO>> getAllUnits(@RequestParam(name = "type", required = false) UnitType type) {
        if (type != null) {
            return new ResponseObject<>(true, "Get all units successfully!", service.findUnitsByType(type));
        }
        return new ResponseObject<>(true, "Get all units successfully!", service.findAll());
    }

    @GetMapping("/{symbol}")
    @ResponseBody
    ResponseObject<UnitSymbolDTO> getUnitBySymbol(@PathVariable(name = "symbol") phong.tran1.habibi.enums.units.UnitSymbol symbol) {
        return new ResponseObject<>(true, "Get successfully!", service.findBySymbol(symbol));
    }

    @PostMapping("/create")
    @ResponseBody
    void createUnitSymbol(@RequestBody UnitSymbol unitSymbol) {
        service.create(unitSymbol);
    }
}
