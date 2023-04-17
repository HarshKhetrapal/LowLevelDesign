package designpatterns.bridgeDesignPattern.implementor;

public class WaterBreatheImplementor implements IBreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Water Breathe, we breathe from gills.");
    }
}
