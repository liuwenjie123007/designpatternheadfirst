package chapter03;

/**
 * 首先，让Espresso扩展自beverage类， 因为Espresso是一种饮料
 *
 * @Author L
 * @Since 2020/06/14 17:51
 * @Version 1.0
 **/
public class Espresso extends Beverage{

    /**
    * 为了要设置饮料的描述，我们写了一个构造器，记住，description实例变量继承自Beverage
    * @Author L
    * @Since 17:52 2020/06/14
    * @Param []
    * @return
    **/
    public Espresso() {
        description = "Espresso";
    }

    /**
    * 最后，需要计算Espresso的价钱，现在不需要管饮料的价钱，直接把Espresso的价格返回即可
    * @Author L
    * @Since 17:53 2020/06/14
    * @Param []
    * @return double
    **/
    @Override
    public double cost() {
        return 1.99;
    }
}
