package chapter04.abstractfactory;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:32
 * @Version 1.0
 **/
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clam createClam() {
        return null;
    }
}
