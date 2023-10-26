package designpatterns.strategydesignpattern;

public class Application {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
        Vehicle normalVehicle = new NormalVehicle();
        normalVehicle.drive();
    }
}
