package designpatterns.nullobjectdesignpattern;

public class VehicleFactory {
    public static IVehicle getVehicleObject(String vehicleType) {
        if(vehicleType.equals("CAR")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
