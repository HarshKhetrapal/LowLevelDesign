package parkinglot.costcalculation.factory;

import parkinglot.costcalculation.CostComputation;
import parkinglot.costcalculation.FourWheelerCostComputation;
import parkinglot.costcalculation.TwoWheelerCostComputation;
import parkinglot.ticket.Ticket;
import parkinglot.vehicle.VehicleType;


public class CostComputationFactory {
    public CostComputation getCostComputation(Ticket ticket) {
        if(ticket.vehicle.getVehicleType().equals(VehicleType.twoWheeler))
            return new TwoWheelerCostComputation();
        else
            return new FourWheelerCostComputation();
    }
}
