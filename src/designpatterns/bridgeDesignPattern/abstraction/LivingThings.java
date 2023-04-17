package designpatterns.bridgeDesignPattern.abstraction;

import designpatterns.bridgeDesignPattern.implementor.IBreatheImplementor;

public abstract class LivingThings {
    IBreatheImplementor breatheImplementor;

    public LivingThings(IBreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    public abstract void breatheProcess();
}
