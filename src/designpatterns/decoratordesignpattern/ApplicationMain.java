package designpatterns.decoratordesignpattern;

import designpatterns.decoratordesignpattern.decorator.Pineapple;
import designpatterns.decoratordesignpattern.decorator.SweetCorn;
import designpatterns.decoratordesignpattern.pizza.BasePizza;
import designpatterns.decoratordesignpattern.pizza.MargeritaPizza;

public class ApplicationMain {
    public static void main(String args[]) {
        BasePizza basePizza = new MargeritaPizza();
        BasePizza pineapplePizza = new Pineapple(basePizza);
        System.out.println("pineapplePizza price is: " + pineapplePizza.cost());
        BasePizza veggieDelight = new SweetCorn(pineapplePizza);
        System.out.println("veggieDelight price is: " + veggieDelight.cost());
    }
}
