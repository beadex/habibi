package phong.tran1.habibi.entities;

import lombok.Getter;
import lombok.Setter;
import phong.tran1.habibi.enums.units.UnitAlpha;
import phong.tran1.habibi.enums.units.UnitType;

import javax.persistence.*;

@Entity(name = "unit_symbols")
@Getter
@Setter
public class UnitSymbol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String display;

    @Column(name = "type")
    private UnitType type;

    @Column(name = "symbol")
    private phong.tran1.habibi.enums.units.UnitSymbol symbol;

    @Column(name = "alpha")
    private UnitAlpha alpha;
}
