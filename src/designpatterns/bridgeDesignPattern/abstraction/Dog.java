package designpatterns.bridgeDesignPattern.abstraction;

import designpatterns.bridgeDesignPattern.implementor.IBreatheImplementor;

public class Dog extends LivingThings {
    public Dog(IBreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        this.breatheImplementor.breathe();
    }
}
