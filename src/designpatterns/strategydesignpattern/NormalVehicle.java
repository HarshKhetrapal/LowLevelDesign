package designpatterns.strategydesignpattern;

import designpatterns.strategydesignpattern.strategy.DriveStrategy;
import designpatterns.strategydesignpattern.strategy.NormalDrive;

public class NormalVehicle extends Vehicle{
    public NormalVehicle() {
        super(new NormalDrive());
    }
}
