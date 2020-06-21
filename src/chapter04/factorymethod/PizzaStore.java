package chapter04.factorymethod;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:12
 * @Version 1.0
 **/
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
