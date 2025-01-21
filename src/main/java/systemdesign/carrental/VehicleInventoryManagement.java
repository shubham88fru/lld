package systemdesign.carrental;

import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicleList;

    VehicleInventoryManagement(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    //all crud operations to manage addition, deletion etc of vehicles.
}
