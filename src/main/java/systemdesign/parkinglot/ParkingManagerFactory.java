package systemdesign.parkinglot;

import java.util.List;

public class ParkingManagerFactory {
    public static ParkingSpotManager getParkingSpotManager(VehicleType vehicleType,
                                       List<ParkingSpot> parkingSpots, IParkingSpotFindStrategy strategy) {
        switch (vehicleType) {
            case TWO_WHEELER -> {
                return new TwoWheelerParkingSpotManager(parkingSpots, strategy);
            }
            case FOUR_WHEELER -> {
                return new FourWheelerParkingSpotManager(parkingSpots, strategy);
            }
        }

        return null;
    }
}
