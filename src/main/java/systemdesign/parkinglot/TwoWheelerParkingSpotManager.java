package systemdesign.parkinglot;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager {
    public TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, IParkingSpotFindStrategy parkingSpotFindStrategy) {
        super(parkingSpots, parkingSpotFindStrategy);
    }
}
