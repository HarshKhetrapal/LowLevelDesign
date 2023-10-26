package parkinglot.costcalculation;

import parkinglot.costcalculation.strategy.HourlyPricing;

public class FourWheelerCostComputation extends CostComputation {
    public FourWheelerCostComputation() {
        super(new HourlyPricing());
    }
}
