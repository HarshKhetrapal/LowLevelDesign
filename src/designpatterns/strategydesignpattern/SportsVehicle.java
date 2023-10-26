package designpatterns.strategydesignpattern;

import designpatterns.strategydesignpattern.strategy.DriveStrategy;
import designpatterns.strategydesignpattern.strategy.SportyDrive;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportyDrive());
    }
}
