package carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = createUsers();
        List<Vehicle> vehicleList = createVehicles();
        List<Store> storeList = createStores(vehicleList);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(userList, storeList);

        User harshUser = userList.get(0);

        Store store = rentalSystem.getStore(new Location("#1746, 90th Cross, KS layout", "Bengalure", "Karnataka", 560078));

        List<Vehicle> vehiclesInStore = store.getVehicles(VehicleType.CAR);

        Reservation reservation = store.createReservation(vehiclesInStore.get(0), harshUser);

        Bill bill = new Bill(reservation);

        Payment payment = new Payment();
        payment.payBill(bill);

        store.completeReservation(reservation.ReservationId);
    }

    private static List<Store> createStores(List<Vehicle> vehicles) {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store(new Location("#1746, 90th Cross, KS layout", "Bengalure", "Karnataka", 560078));
        store1.setVehicles(vehicles);
        stores.add(store1);
        return stores;
    }

    private static List<Vehicle> createVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle(1, "KA02CD0001", 2000, 696969, "Bentely", VehicleType.CAR, Status.ACTIVE, 5000, 500);
        Vehicle vehicle2 = new Vehicle(2, "KA69EF0001", 1000, 969696, "Maruti", VehicleType.CAR, Status.ACTIVE, 1000, 100);
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        return vehicles;
    }

    private static List<User> createUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User("1", "Harsh");
        user1.setDrivingLincense("4WValidLicense");
        User user2 = new User("2", "Devesh");
        user2.setDrivingLincense("2WValidLicense");
        users.add(user1);
        users.add(user2);
        return users;
    }
}
