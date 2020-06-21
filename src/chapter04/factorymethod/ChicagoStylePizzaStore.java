package chapter04.factorymethod;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:19
 * @Version 1.0
 **/
public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
