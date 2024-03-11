package systemdesign.flighbooking.notification;

public class EmailNotification extends Notification {
    private String email;
    @Override
    protected boolean send() {
        return false;
    }
}
