package parkinglot.exitgate;

import parkinglot.costcalculation.CostComputation;
import parkinglot.costcalculation.factory.CostComputationFactory;
import parkinglot.parkingspot.factory.ParkingManagerFactory;
import parkinglot.parkingspot.manager.ParkingSpotManager;
import parkinglot.payment.Payment;
import parkinglot.ticket.Ticket;

public class ExitGate {
    private CostComputationFactory costComputationFactory;
    private CostComputation costComputation;
    public Ticket ticket;
    ParkingManagerFactory parkingManagerFactory;

    public ExitGate() {
        costComputationFactory = new CostComputationFactory();
        parkingManagerFactory = new ParkingManagerFactory();
    }

    public Long calculatePrice(Ticket ticket) {
        costComputation = costComputationFactory.getCostComputation(ticket);
        return costComputation.calculateTotalAmount(ticket);
    }
    public Boolean payAmount(Ticket ticket, Payment payment) {
        return true;
    }
    public void removeVehicleFromParkingSpot(Ticket ticket) {
        ParkingSpotManager spotManager = parkingManagerFactory.getParkingManager(ticket.vehicle.getVehicleType());
        spotManager.removeVehicle(ticket.parkingSpot);
    }
}
