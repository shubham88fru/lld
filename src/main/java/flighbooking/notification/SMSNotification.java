package flighbooking.notification;

public class SMSNotification extends Notification {
    private long mbNo;
    @Override
    protected boolean send() {
        return false;
    }
}
