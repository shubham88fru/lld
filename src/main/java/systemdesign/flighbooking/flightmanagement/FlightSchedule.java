package systemdesign.flighbooking.flightmanagement;

import java.time.LocalDateTime;
import java.util.List;

public class FlightSchedule {
    private Flight flight;
    private LocalDateTime departureTime;

    private String gate;

    private FlightStatus status;

    private List<FlightSeat> flightSeats;
}
