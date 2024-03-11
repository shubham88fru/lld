package systemdesign.flighbooking.flightmanagement;

import java.util.List;

public class Flight {
    private String flightNo;
    private int duration;

    private Airport source;
    private Airport destination;

    private List<Seat> seats;

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Airport getSource() {
        return source;
    }

    public void setSource(Airport source) {
        this.source = source;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }
}
