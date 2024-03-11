package systemdesign.flighbooking.notification;

import java.time.LocalDateTime;

public abstract class Notification {
    private int id;
    LocalDateTime createdAt;
    private String content;

    protected abstract boolean send();

}
