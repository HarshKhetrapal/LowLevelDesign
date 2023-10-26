package parkinglot.parkingspot.manager;

import parkinglot.parkingspot.FourWheelerParkingSpot;
import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspot.TwoWheelerParkingSpot;
import parkinglot.parkingspot.strategy.NearToEntranceAndElevator;
import parkinglot.parkingspot.strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class FourWheelerParkingManager extends ParkingSpotManager {
    public static List<ParkingSpot> parkingSpotList = new ArrayList<ParkingSpot>();

    public static List<ParkingSpot> setParkingSpotList() {
        parkingSpotList.add(new FourWheelerParkingSpot());
        parkingSpotList.add(new FourWheelerParkingSpot());
        parkingSpotList.add(new FourWheelerParkingSpot());
        return parkingSpotList;
    }

    public FourWheelerParkingManager() {
        super(new NearToEntranceAndElevator(), parkingSpotList);
    }
}
