package chapter04.factorymethod;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:11
 * @Version 1.0
 **/
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "¥n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "¥n");
    }
}
