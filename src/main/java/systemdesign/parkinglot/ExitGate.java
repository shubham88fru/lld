package systemdesign.parkinglot;

public class ExitGate {
    Ticket t;
    CostComputationFactory costComputationFactory;

    public double getCost() {
        return CostComputationFactory.getCostComputer(t.vehicle.vehicleType).calculateCost(t);
    }
}
