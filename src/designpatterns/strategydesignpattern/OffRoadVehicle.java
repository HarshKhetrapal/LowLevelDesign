package designpatterns.strategydesignpattern;

import designpatterns.strategydesignpattern.strategy.DriveStrategy;
import designpatterns.strategydesignpattern.strategy.SportyDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(DriveStrategy driveStrategy) {
        super(new SportyDrive());
    }
}
