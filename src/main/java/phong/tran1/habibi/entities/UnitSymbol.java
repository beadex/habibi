package phong.tran1.habibi.entities;

import lombok.*;
import org.hibernate.Hibernate;
import phong.tran1.habibi.enums.units.UnitAlpha;
import phong.tran1.habibi.enums.units.UnitType;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "unit_symbols")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UnitSymbol that = (UnitSymbol) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
