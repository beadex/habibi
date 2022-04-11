package phong.tran1.habibi.enums.habits;

public enum TimeOfDay {
    MORNING("morning"),
    AFTERNOON("afternoon"),
    EVENING("evening"),
    ALL("all");

    public final String value;

    TimeOfDay(String value) {
        this.value = value;
    }
}
