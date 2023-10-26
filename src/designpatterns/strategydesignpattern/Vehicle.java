package designpatterns.strategydesignpattern;

import designpatterns.strategydesignpattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive() {
        this.driveStrategy.drive();
    }
}
