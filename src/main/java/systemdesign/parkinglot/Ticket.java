package systemdesign.parkinglot;

import java.time.LocalDateTime;

public class Ticket {
    LocalDateTime entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(LocalDateTime entryTime, Vehicle vehicle, ParkingSpot parkingSpot) {
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }
}
