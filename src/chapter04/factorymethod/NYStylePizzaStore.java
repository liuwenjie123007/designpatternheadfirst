package chapter04.factorymethod;

import chapter04.simplefactory.CheesePizza;
import chapter04.simplefactory.ClamPizza;
import chapter04.simplefactory.PepperoniPizza;
import chapter04.simplefactory.VeggiePizza;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:16
 * @Version 1.0
 **/
public class NYStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        }
        return pizza;
    }
}
