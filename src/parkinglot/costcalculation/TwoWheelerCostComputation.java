package parkinglot.costcalculation;

import parkinglot.costcalculation.strategy.MinutePricing;

public class TwoWheelerCostComputation extends CostComputation {
    public TwoWheelerCostComputation() {
        super(new MinutePricing());
    }
}
