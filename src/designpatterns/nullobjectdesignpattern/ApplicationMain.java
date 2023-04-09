package designpatterns.nullobjectdesignpattern;

public class ApplicationMain {
    public static void main(String[] args) {
        IVehicle vehicle = VehicleFactory.getVehicleObject("CAR");
        System.out.println("Seating Capacity for Car: " + vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity for Car: " + vehicle.getTankCapacity());

        IVehicle bikeVehicle = VehicleFactory.getVehicleObject("BIKE");
        System.out.println("Seating Capacity for Bike: " + bikeVehicle.getSeatingCapacity());
        System.out.println("Tank Capacity for Bike: " + bikeVehicle.getTankCapacity());
    }
}
