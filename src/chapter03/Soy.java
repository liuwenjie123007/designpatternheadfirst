package chapter03;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/14 18:03
 * @Version 1.0
 **/
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
