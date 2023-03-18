package designpatterns.decoratordesignpattern.decorator;

import designpatterns.decoratordesignpattern.pizza.BasePizza;

public class ExtraCheese extends Toppings{
    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 100;
    }
}
