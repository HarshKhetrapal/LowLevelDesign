package parkinglot.costcalculation.strategy;

import parkinglot.ticket.Ticket;

import java.time.Duration;
import java.time.Instant;

public class MinutePricing extends PricingStrategy {
    @Override
    public long priceCalculate(Ticket ticket) {
        Instant end = Instant.now();
        long timeElapsed = Duration.between(ticket.getStartTime(), end).toMinutes();
        return timeElapsed * ticket.parkingSpot.getPrice();
    }
}
