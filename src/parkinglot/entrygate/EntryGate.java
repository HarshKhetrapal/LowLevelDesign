package parkinglot.entrygate;

import parkinglot.parkingspot.ParkingSpot;
import parkinglot.parkingspot.factory.ParkingManagerFactory;
import parkinglot.parkingspot.manager.ParkingSpotManager;
import parkinglot.ticket.Ticket;
import parkinglot.vehicle.Vehicle;

public class EntryGate {
    private ParkingManagerFactory parkingManagerFactory;
    private ParkingSpotManager spotManager;
    private ParkingSpot parkingSpot;
    private Ticket ticket;
    public EntryGate() {
        parkingManagerFactory = new ParkingManagerFactory();
    }
    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        spotManager = parkingManagerFactory.getParkingManager(vehicle.getVehicleType());
        parkingSpot = spotManager.findParkingSpot();
        return parkingSpot;
    }
    public void bookSpot(Vehicle vehicle) {
        parkingSpot.parkVehicle(vehicle);
    }
    public Ticket generateTicket(Vehicle vehicle) {
        ticket = new Ticket(vehicle, parkingSpot);
        return ticket;
    }
}
