package chapter04.factorymethod;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:08
 * @Version 1.0
 **/
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
