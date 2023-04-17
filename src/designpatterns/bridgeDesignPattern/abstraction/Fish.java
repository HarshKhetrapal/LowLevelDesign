package designpatterns.bridgeDesignPattern.abstraction;

import designpatterns.bridgeDesignPattern.implementor.IBreatheImplementor;

public class Fish extends LivingThings {
    public Fish(IBreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        this.breatheImplementor.breathe();
    }
}
