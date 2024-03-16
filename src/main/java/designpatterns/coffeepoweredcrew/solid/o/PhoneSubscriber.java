package designpatterns.coffeepoweredcrew.solid.o;

import java.util.List;
public class PhoneSubscriber extends Subscriber {

    //open for extension.
    @Override
    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

}