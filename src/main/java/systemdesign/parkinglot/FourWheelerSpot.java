package systemdesign.parkinglot;

public class FourWheelerSpot extends ParkingSpot{
    @Override
    public double getPrice() {
        return this.getBasePrice() * 50;
    }
}
