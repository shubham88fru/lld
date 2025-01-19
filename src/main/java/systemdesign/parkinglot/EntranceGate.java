package systemdesign.parkinglot;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class EntranceGate {
    ParkingManagerFactory parkingManagerFactory;
//    ParkingSpotManager parkingSpotManager;

//    public EntranceGate(VehicleType vehicleType, IParkingSpotFindStrategy strategy) {
//        this.parkingSpotManager = ParkingManagerFactory
//                .getParkingSpotManager(vehicleType, new ArrayList<>(), strategy);
//    }

    public ParkingSpot findSpace(VehicleType vehicleType, IParkingSpotFindStrategy strategy) {
        return ParkingManagerFactory
                .getParkingSpotManager(vehicleType, new ArrayList<>(), strategy).findParkingSpot();
    }

    public void bookSpot(ParkingSpot spot, Vehicle v) {
        spot.parkVehicle(v);
    }

    public Ticket generateTicket(ParkingSpot spot, Vehicle v) {
        return new Ticket(LocalDateTime.now(), v, spot);
    }
}
