package designpatterns.bridgeDesignPattern;

import designpatterns.bridgeDesignPattern.abstraction.Dog;
import designpatterns.bridgeDesignPattern.abstraction.Fish;
import designpatterns.bridgeDesignPattern.abstraction.LivingThings;
import designpatterns.bridgeDesignPattern.abstraction.Tree;
import designpatterns.bridgeDesignPattern.implementor.LandBreatheImplementor;
import designpatterns.bridgeDesignPattern.implementor.TreeBreatheImplementor;
import designpatterns.bridgeDesignPattern.implementor.WaterBreatheImplementor;

public class ApplicationMain {
    public static void main(String[] args) {
        LivingThings dog = new Dog(new LandBreatheImplementor());
        LivingThings fish = new Fish(new WaterBreatheImplementor());
        LivingThings tree = new Tree(new TreeBreatheImplementor());
        dog.breatheProcess();
        fish.breatheProcess();
        tree.breatheProcess();
    }
}
