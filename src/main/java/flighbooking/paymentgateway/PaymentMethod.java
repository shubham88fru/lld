package flighbooking.paymentgateway;

public interface PaymentMethod {
    boolean pay(double amount);
}
