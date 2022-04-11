package phong.tran1.habibi.enums.units;

public enum UnitSymbol {
    KM("kM"),
    M("m"),
    FT("ft"),
    YD("yd"),
    MI("mi"),
    L("L"),
    ML("mL"),
    FL_OZ("fl oz"),
    CUP("cup"),
    KG("kg"),
    G("g"),
    MG("mg"),
    MCG("mcg"),
    OZ("oz"),
    LB("lb"),
    SEC("sec"),
    MIN("min"),
    HR("hr"),
    J("J"),
    KJ("kJ"),
    KCAL("kCal"),
    CAL("cal"),
    REP("rep"),
    STEP("step"),
    NONE("");

    public final String value;

    UnitSymbol(String value) {
        this.value = value;
    }
}
