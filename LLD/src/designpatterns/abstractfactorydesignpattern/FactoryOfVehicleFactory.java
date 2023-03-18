package designpatterns.abstractfactorydesignpattern;

public class FactoryOfVehicleFactory {
    public VehicleFactory getVehivleFactory(String VehicleType) {
        switch (VehicleType) {
            case "LUX": return new LuxuryVehicleFactory();
            case "ORD": return new OrdinaryVehicleFactory();
            default: return null;
        }
    }
}
