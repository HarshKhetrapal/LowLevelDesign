package parkinglot.ticket;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.vehicle.Vehicle;

import java.time.Instant;
import java.util.Random;

public class Ticket {
    private int id;
    private Instant startTime;
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        Random rand = new Random();
        this.id = rand.nextInt(1000);
        this.startTime = Instant.now();
    }

    public Instant getStartTime() {
        return startTime;
    }
}
