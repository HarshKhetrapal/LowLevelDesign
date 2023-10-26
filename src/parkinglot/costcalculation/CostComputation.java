package parkinglot.costcalculation;

import parkinglot.costcalculation.strategy.PricingStrategy;
import parkinglot.ticket.Ticket;

public class CostComputation {
    private PricingStrategy pricingStrategy;

    public CostComputation(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public long calculateTotalAmount(Ticket ticket) {
        return pricingStrategy.priceCalculate(ticket);
    }
}
