package designpatterns.strategydesignpattern.strategy;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Drive like a normal guy");
    }
}
