package designpatterns.nullobjectdesignpattern;

public class Car implements IVehicle {

    @Override
    public int getSeatingCapacity() {
        return 7;
    }

    @Override
    public int getTankCapacity() {
        return 1000;
    }
}
