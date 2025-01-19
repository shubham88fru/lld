package systemdesign.parkinglot;

import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyPricingStrategy implements IPricingStrategy{
    @Override
    public double computePrice(Ticket t) {
        return Duration.between(LocalDateTime.now(), t.entryTime).toHours()*t.parkingSpot.getPrice();
    }
}
