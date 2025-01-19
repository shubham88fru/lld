package systemdesign.parkinglot;

public abstract class ParkingSpot {
    private long id;
    private boolean isOccupied;
    private Vehicle vehicle;
    private double basePrice;
    private double price;

    public void parkVehicle(Vehicle v) {
        isOccupied = true;
        vehicle = v;
    }

    public void unparkVehicle() {
        isOccupied = false;
        vehicle = null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public abstract double getPrice() ;

    public void setBasePrice(double price) {
        this.basePrice = price;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
