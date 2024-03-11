package systemdesign.flighbooking.paymentgateway;

import java.time.LocalDateTime;

public class MobileTransaction implements PaymentMethod {
    private String serviceProvider;
    private int mobileNo;
    private LocalDateTime expiresAt;
    @Override
    public boolean pay(double amount) {
        return false;
    }
}
