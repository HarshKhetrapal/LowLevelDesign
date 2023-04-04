package carrentalsystem;

import java.util.List;

public class VehicleRentalSystem {
    private List<User> users;
    private List<Store> stores;
    public VehicleRentalSystem(List<User> users, List<Store> stores) {
        this.stores = stores;
        this.users = users;
    }
    public void addUser(User user) {
        users.add(user);
    }
    public void addStore(Store store) {
        stores.add(store);
    }

    public Store getStore(Location location) {
        //TODO: Improve this
        return stores.get(0);
    }
}
