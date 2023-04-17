package designpatterns.bridgeDesignPattern.abstraction;

import designpatterns.bridgeDesignPattern.implementor.IBreatheImplementor;

public class Tree extends LivingThings {
    public Tree(IBreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        this.breatheImplementor.breathe();
    }
}
