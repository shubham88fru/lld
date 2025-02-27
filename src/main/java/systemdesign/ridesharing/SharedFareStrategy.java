package systemdesign.ridesharing;

public class SharedFareStrategy implements FareStrategy {
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance * 0.5;
    }
}
