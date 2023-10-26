package parkinglot.parkingspot.manager;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspot.strategy.ParkingStrategy;
import parkinglot.vehicle.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    private ParkingStrategy parkingStrategy;
    private List<ParkingSpot> parkingSpotList;

    public ParkingSpotManager(ParkingStrategy parkingStrategy, List<ParkingSpot> parkingSpotList) {
        this.parkingStrategy = parkingStrategy;
        this.parkingSpotList = parkingSpotList;
    }

    public ParkingSpot findParkingSpot() {
        return parkingStrategy.find();
    }

    public void addParkingSpot(ParkingSpot spot) {
        parkingSpotList.add(spot);
    }

    public void removeParkingSpot(ParkingSpot spot) {
        parkingSpotList.remove(spot);
    }

    public void parkVehicle(Vehicle vehicle, ParkingSpot spot) {
        spot.parkVehicle(vehicle);
    }

    public void removeVehicle(ParkingSpot spot) {
        spot.removeVehicle();
    }
}
