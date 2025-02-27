package systemdesign.ridesharing;

abstract class Vehicle {
    protected String numberplate;
    public Vehicle(String numberplate) {
        this.numberplate = numberplate;
    }

    public abstract double getFarePerKm();
}
