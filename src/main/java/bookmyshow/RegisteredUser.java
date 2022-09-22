package bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class RegisteredUser extends User {
    private List<Ticket> bookingHistory;

    public RegisteredUser(int id, String name, List<Ticket> bookingHistory) {
        super(id, name);
        this.bookingHistory = new ArrayList<>();
    }
}
