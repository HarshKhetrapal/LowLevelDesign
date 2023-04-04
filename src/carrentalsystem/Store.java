package carrentalsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Store {
    private int storeId;
    VehicleInventory vehicleInventory;
    List<Reservation> reservationList;
    Location location;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public List<Vehicle> getVehicles(VehicleType vehicleType) {
        return vehicleInventory.getVehicleBasedOnType(vehicleType);
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicleInventory = new VehicleInventory(vehicles);
    }

    public Store(Location location) {
        this.reservationList = new ArrayList<>();
        this.location = location;
    }

    public Reservation createReservation(Vehicle vehicle, User user) {
        Reservation reservation = new Reservation(1, user, vehicle, LocalDate.now(), LocalDate.now(), LocalDate.now(), this.location, this.location, ReservationStatus.SCHEDULED);
        reservationList.add(reservation);
        return reservation;
    }

    public Reservation updateReservation(Reservation reservation) {
        // TODO: Can implement this to update the reservation.
        return null;
    }

    public boolean completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

}
