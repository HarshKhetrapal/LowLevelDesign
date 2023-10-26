package parkinglot.parkingspot.factory;

import parkinglot.parkingspot.manager.FourWheelerParkingManager;
import parkinglot.parkingspot.manager.ParkingSpotManager;
import parkinglot.parkingspot.manager.TwoWheelerParkingManager;
import parkinglot.vehicle.VehicleType;

public class ParkingManagerFactory {
    public ParkingSpotManager getParkingManager(VehicleType vehicleType) {
        if (vehicleType.equals(VehicleType.twoWheeler))
            return new TwoWheelerParkingManager();
        else return new FourWheelerParkingManager();
    }
}
