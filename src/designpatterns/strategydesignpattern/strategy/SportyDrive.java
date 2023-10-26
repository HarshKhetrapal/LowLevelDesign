package designpatterns.strategydesignpattern.strategy;

public class SportyDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive like a Maniac");
    }
}
