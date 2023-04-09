package designpatterns.nullobjectdesignpattern;

public class NullVehicle implements IVehicle {
    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
