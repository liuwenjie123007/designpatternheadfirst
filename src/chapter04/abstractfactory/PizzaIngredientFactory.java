package chapter04.abstractfactory;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:29
 * @Version 1.0
 **/
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clam createClam();
}
