package systemdesign.parkinglot;

public interface IPricingStrategy {
    double computePrice(Ticket t);
}
