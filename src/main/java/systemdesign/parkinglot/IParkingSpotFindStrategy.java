package systemdesign.parkinglot;

import java.util.List;

public interface IParkingSpotFindStrategy {
    ParkingSpot find(List<ParkingSpot> spots);
}
