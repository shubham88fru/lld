package systemdesign.parkinglot;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;
    IParkingSpotFindStrategy parkingSpotFindStrategy;

    public ParkingSpotManager(List<ParkingSpot> parkingSpots, IParkingSpotFindStrategy parkingSpotFindStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingSpotFindStrategy = parkingSpotFindStrategy;
    }

    public ParkingSpot findParkingSpot() {
        return parkingSpotFindStrategy.find(parkingSpots);
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }

    public void removeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.remove(parkingSpot);
    }

//    public void parkVehicle(ParkingSpot parkingSpot) {}

//    public void unparkVehicle(ParkingSpot parkingSpot) {}
}
