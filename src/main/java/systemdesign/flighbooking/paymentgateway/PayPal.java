package systemdesign.flighbooking.paymentgateway;

import java.time.LocalDateTime;

public class PayPal implements PaymentMethod {
    private String name;
    private String cardNumber;
    private LocalDateTime expiresAt;
    @Override
    public boolean pay(double amount) {
        return false;
    }
}
