package parkinglot.parkingspot;

import parkinglot.vehicle.Vehicle;

import java.util.Random;


public class ParkingSpot {
    private int id;
    private int price;
    public boolean isEmpty;
    private Vehicle vehicle;

    public ParkingSpot(int price) {
        this.price = price;
        Random rand = new Random();
        this.id = rand.nextInt(1000);
        this.isEmpty = true;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        isEmpty = true;
    }
}
