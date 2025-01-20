package systemdesign.elevatorsystem;

//each elevator controller controls one specific elevator.
public class ElevatorController {
    ElevatorCar elevatorCar;

    public ElevatorController(ElevatorCar elevatorCar) {
        this.elevatorCar = elevatorCar;
    }
    public void submitNewRequest(int targetFloor, int direction) {}
    public void controlElevator() {}
}
