package systemdesign.ridesharing;

public interface FareStrategy {
    double calcFare(Vehicle vehicle, double distance);
}
