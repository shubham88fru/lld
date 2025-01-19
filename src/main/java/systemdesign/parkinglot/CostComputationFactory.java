package systemdesign.parkinglot;

public class CostComputationFactory {
    public static CostComputation getCostComputer(VehicleType vehicleType) {
        switch (vehicleType) {
            case TWO_WHEELER -> {
                return new TwoWheelerCostComputation(new HourlyPricingStrategy());
            }

            case FOUR_WHEELER -> {
                return new FourWheelerCostComputation(new MinuteWisePricingStrategy());
            }
        }

        return null;
    }
}
