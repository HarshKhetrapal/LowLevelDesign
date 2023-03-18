package designpatterns.decoratordesignpattern.decorator;

import designpatterns.decoratordesignpattern.pizza.BasePizza;

public class Pineapple extends Toppings{
    BasePizza basePizza;
    public Pineapple(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
