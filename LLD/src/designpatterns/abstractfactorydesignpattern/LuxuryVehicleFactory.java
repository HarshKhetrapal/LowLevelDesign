package designpatterns.abstractfactorydesignpattern;

public class LuxuryVehicleFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String mileageType) {
        switch (mileageType) {
            case "HIGH": return new Porsche();
            case "LOW": return new Lamborgini();
            default: return null;
        }
    }
}
