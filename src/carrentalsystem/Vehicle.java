package carrentalsystem;

public class Vehicle {
    private int id;
    private String number;
    private int cc;
    private int kmDrivern;
    private String Company;
    VehicleType vehicleType;
    Status status;

    public Vehicle(int id, String number, int cc, int kmDrivern, String company, VehicleType vehicleType, Status status, int dailyCost, int hourlyCost) {
        this.id = id;
        this.number = number;
        this.cc = cc;
        this.kmDrivern = kmDrivern;
        Company = company;
        this.vehicleType = vehicleType;
        this.status = status;
        this.dailyCost = dailyCost;
        this.hourlyCost = hourlyCost;
    }

    private int dailyCost;
    private int hourlyCost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getKmDrivern() {
        return kmDrivern;
    }

    public void setKmDrivern(int kmDrivern) {
        this.kmDrivern = kmDrivern;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getDailyCost() {
        return dailyCost;
    }

    public void setDailyCost(int dailyCost) {
        this.dailyCost = dailyCost;
    }

    public int getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(int hourlyCost) {
        this.hourlyCost = hourlyCost;
    }
}
