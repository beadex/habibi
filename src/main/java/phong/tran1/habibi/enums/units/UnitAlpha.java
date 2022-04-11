package phong.tran1.habibi.enums.units;

public enum UnitAlpha {
    KM(1000.0),
    M(1.0),
    FT(0.3048),
    YD(0.9144),
    MI(1609.34),
    L(1.0),
    ML(0.001),
    FL_OZ(0.0295735),
    CUP(0.24),
    KG(1.0),
    G(0.001),
    MG(0.000001),
    MCG(0.000000001),
    OZ(0.0283495),
    LB(0.453592),
    SEC(1.0),
    MIN(60.0),
    HR(3600.0),
    J(1.0),
    KJ(1000.0),
    KCAL(4184.0),
    CAL(4.184),
    REP(1.0),
    STEP(1.0);

    public final Double value;

    UnitAlpha(Double value) {
        this.value = value;
    }
}
