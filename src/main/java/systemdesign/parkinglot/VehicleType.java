package systemdesign.parkinglot;

public enum VehicleType {
    TWO_WHEELER("Two Wheeler"),
    FOUR_WHEELER("Four Wheeler");
    private final String type;

    VehicleType(String type) {
        this.type = type;
    }
}
