package systemdesign.elevatorsystem;

import java.util.List;

public abstract class ExternalButtonRequestDispatcher {
    List<ElevatorController> elevatorControllerList;
    public void submitRequest(int targetFloor, Direction direction) {}
}
