package systemdesign.parkinglot;

public class TwoWheelerSpot extends ParkingSpot{
    @Override
    public double getPrice() {
        return this.getBasePrice() * 10;
    }
}
