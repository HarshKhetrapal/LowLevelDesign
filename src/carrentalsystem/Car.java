package carrentalsystem;

public class Car extends Vehicle{

    public Car(int id, String number, int cc, int kmDrivern, String company, VehicleType vehicleType, Status status, int dailyCost, int hourlyCost) {
        super(id, number, cc, kmDrivern, company, vehicleType, status, dailyCost, hourlyCost);
    }
}
