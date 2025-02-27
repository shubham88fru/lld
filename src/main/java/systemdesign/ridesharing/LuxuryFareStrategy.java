package systemdesign.ridesharing;

public class LuxuryFareStrategy implements FareStrategy {
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance * 1.5;
    }
}
