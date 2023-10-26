package parkinglot.parkingspot.manager;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspot.TwoWheelerParkingSpot;
import parkinglot.parkingspot.strategy.NearToEntrance;
import parkinglot.parkingspot.strategy.ParkingStrategy;

import java.util.ArrayList;
import java.util.List;

public class TwoWheelerParkingManager extends ParkingSpotManager {
    public static List<ParkingSpot> parkingSpotList = new ArrayList<ParkingSpot>();

    public static List<ParkingSpot> setParkingSpotList() {
        parkingSpotList.add(new TwoWheelerParkingSpot());
        parkingSpotList.add(new TwoWheelerParkingSpot());
        return parkingSpotList;
    }

    public TwoWheelerParkingManager() {
        super(new NearToEntrance(), setParkingSpotList());
    }
}
