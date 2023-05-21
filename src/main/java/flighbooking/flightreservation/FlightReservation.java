package flighbooking.flightreservation;

import flighbooking.flightmanagement.FlightSchedule;
import flighbooking.flightmanagement.FlightSeat;

import java.time.LocalDateTime;
import java.util.Map;

public class FlightReservation {
    private String reservationNum;
    private FlightSchedule schedule;
    private Map<Customer, FlightSeat> seatMap;
    private LocalDateTime creationTime;
    private ReservationStatus status;
}
