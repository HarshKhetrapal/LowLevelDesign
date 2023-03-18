package designpatterns.abstractfactorydesignpattern;

public class ApplicationMain {
    public static void main(String args[]) {
        FactoryOfVehicleFactory factoryOfVehicleFactory = new FactoryOfVehicleFactory();
        VehicleFactory vehicleFactory = factoryOfVehicleFactory.getVehivleFactory("LUX");
        Vehicle highMileageLux = vehicleFactory.getVehicle("HIGH");
        Vehicle lowMileageLux = vehicleFactory.getVehicle("LOW");
        highMileageLux.getMilege();
        lowMileageLux.getMilege();

        VehicleFactory OrdvehicleFactory = factoryOfVehicleFactory.getVehivleFactory("ORD");
        Vehicle highMileageOrd = OrdvehicleFactory.getVehicle("HIGH");
        Vehicle lowMileageOrd = OrdvehicleFactory.getVehicle("LOW");
        highMileageOrd.getMilege();
        lowMileageOrd.getMilege();
    }
}
