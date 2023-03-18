package designpatterns.decoratordesignpattern.decorator;

import designpatterns.decoratordesignpattern.pizza.BasePizza;

public class SweetCorn extends Toppings{
    BasePizza basePizza;
    public SweetCorn(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }
}
