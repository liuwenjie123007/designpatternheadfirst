package chapter04.abstractfactory;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/15 22:39
 * @Version 1.0
 **/
public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
