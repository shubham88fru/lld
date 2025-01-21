package systemdesign.carrental;

import java.util.List;

public class VehicleRentalSystem {
    List<User> users;
    List<Store> stores;

    VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.stores = stores;
        this.users = users;
    }

    public Store getStore(Location location) {
        return stores.get(0);
    }

    //crud ops on stores and users.
}
