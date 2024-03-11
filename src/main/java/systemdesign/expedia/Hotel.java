package systemdesign.expedia;

import java.util.List;

public class Hotel {
    int id;
    String hotelName;
    Address address;
    List<Room> rooms;

    public boolean checkAvailability(List<Room> rooms) {
        //Any logic to check if requested rooms are available.
        for (Room room: rooms) {
            if (room.status == RoomStatus.OCCUPIED) return false;
        }
        return true;
    }
}
