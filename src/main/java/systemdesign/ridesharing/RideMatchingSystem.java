package systemdesign.ridesharing;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingSystem {
    private List<Driver> availableDrivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy) {
        if (availableDrivers.isEmpty()) {
            passenger.notify("No ride available");
            return;
        }

        Driver driver = findNearestDriver(passenger.getLocation());
        passenger.notify("Ride scheduled succesfully" + driver);
    }

    private Driver findNearestDriver(Location location) {
        Driver nearestDriver = null;
        double minDistance = Double.MAX_VALUE;

        for (Driver driver : availableDrivers) {
            double dist = driver.getLocation().calcDistance(location);
            if (dist < minDistance) {
                minDistance = dist;
                nearestDriver = driver;
            }
        }
        return nearestDriver;
    }


}
