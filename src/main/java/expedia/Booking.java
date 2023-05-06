package expedia;

import java.util.List;

public class Booking {
    int id;
    User user;
    Hotel hotel;
    List<Room> rooms;

    PaymentStatus paymentStatus;

    Duration duration;

    public Booking(User user, Hotel hotel, List<Room> rooms) {
        this.user = user;
        this.hotel = hotel;
        this.rooms = rooms;
    }

    public boolean confirmBooking() {
        return this.hotel.checkAvailability(rooms);
    }
}
