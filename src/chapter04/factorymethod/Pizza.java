package chapter04.factorymethod;

import java.util.ArrayList;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:04
 * @Version 1.0
 **/
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce..");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("    " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Pleace Pizza in official PizzaStore box");
    }

    public java.lang.String getName() {
        return name;
    }
}
