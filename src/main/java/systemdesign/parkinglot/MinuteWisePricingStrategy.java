package systemdesign.parkinglot;


import java.time.Duration;
import java.time.LocalDateTime;

public class MinuteWisePricingStrategy implements IPricingStrategy{
    @Override
    public double computePrice(Ticket t) {
        return Duration.between(LocalDateTime.now(), t.entryTime).toMinutes()*t.parkingSpot.getPrice();
    }
}
