package designpatterns.abstractfactorydesignpattern;

public class OrdinaryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String mileageType) {
        switch (mileageType) {
            case "HIGH": return new Tata();
            case "LOW": return new Mahindra();
            default: return null;
        }
    }
}
