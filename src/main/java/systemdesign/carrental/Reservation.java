package systemdesign.carrental;



import java.time.LocalDateTime;

public class Reservation {
    long id;
    User user;
    Vehicle vehicle;
    LocalDateTime reservationDate;
    LocalDateTime bookedFrom;
    LocalDateTime bookedTo;
    Location pickupLocation;
    Location dropOffLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;

    public void createReservation(User user, Vehicle vehicle) {
        this.id = 123;
        this.user = user;
        this.vehicle = vehicle;
        reservationDate = LocalDateTime.now();
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;
    }
}
