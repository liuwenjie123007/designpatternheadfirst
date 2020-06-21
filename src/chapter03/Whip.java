package chapter03;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/14 18:05
 * @Version 1.0
 **/
public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
