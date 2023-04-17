package designpatterns.bridgeDesignPattern.implementor;

public class LandBreatheImplementor implements IBreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Land Breathe, we breathe from nose.");
    }
}
