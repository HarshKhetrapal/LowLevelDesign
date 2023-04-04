package carrentalsystem;

public class Bike extends Vehicle{

    public Bike(int id, String number, int cc, int kmDrivern, String company, VehicleType vehicleType, Status status, int dailyCost, int hourlyCost) {
        super(id, number, cc, kmDrivern, company, vehicleType, status, dailyCost, hourlyCost);
    }
}
