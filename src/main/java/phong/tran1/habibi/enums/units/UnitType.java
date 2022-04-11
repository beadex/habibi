package phong.tran1.habibi.enums.units;

public enum UnitType {
    LENGTH("LENGTH"),
    VOLUME("VOLUME"),
    MASS("MASS"),
    DURATION("DURATION"),
    ENERGY("ENERGY"),
    SCALAR("SCALAR"),
    STEP("STEP");

    public final String value;

    UnitType(String value) {
        this.value = value;
    }
}
