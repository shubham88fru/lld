package systemdesign.flighbooking.flightreservation;

import systemdesign.flighbooking.flightmanagement.FlightSchedule;
import systemdesign.flighbooking.flightmanagement.FlightSeat;

import java.time.LocalDateTime;
import java.util.Map;

public class FlightReservation {
    private String reservationNum;
    private FlightSchedule schedule;
    private Map<Customer, FlightSeat> seatMap;
    private LocalDateTime creationTime;
    private ReservationStatus status;
}
