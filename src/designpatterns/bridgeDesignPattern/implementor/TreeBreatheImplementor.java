package designpatterns.bridgeDesignPattern.implementor;

public class TreeBreatheImplementor implements IBreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("Tree Breathe, we breathe from leaves.");
    }
}
