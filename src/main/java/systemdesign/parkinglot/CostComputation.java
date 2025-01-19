package systemdesign.parkinglot;

public abstract class CostComputation {
    IPricingStrategy pricingStrategy;

    public CostComputation(IPricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateCost(Ticket t) {
        return pricingStrategy.computePrice(t);
    }
}
