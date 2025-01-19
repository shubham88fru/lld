package systemdesign.parkinglot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    public FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, IParkingSpotFindStrategy parkingSpotFindStrategy) {
        super(parkingSpots, parkingSpotFindStrategy);
    }
}
