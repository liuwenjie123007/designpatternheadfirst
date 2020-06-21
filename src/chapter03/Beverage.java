package chapter03;

/**
 * Beverage时一个抽象类， 有两个方法：setDescription()及cost()
 *
 * @Author L
 * @Since 2020/06/14 17:30
 * @Version 1.0
 **/
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
