package carrentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleInventory {
    private List<Vehicle> vehicleList = new ArrayList<>();

    public List<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public List<Vehicle> getVehicleBasedOnType(VehicleType type) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(vehicleList.get(0));
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public VehicleInventory(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicleList.remove(vehicle);
    }
}
