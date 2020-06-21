package chapter03;

/**
 * TODO
 *
 * @Author L
 * @Since 2020/06/14 17:54
 * @Version 1.0
 **/
public class HouseBlend extends Beverage{

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
