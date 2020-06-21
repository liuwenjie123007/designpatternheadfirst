package chapter03;

/**
 * 摩卡是一个装饰者， 所以让它扩展自CondimentDecoration
 *
 * @Author L
 * @Since 2020/06/14 17:56
 * @Version 1.0
 **/
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    /**
    * 要让Mocha能够引用一个Beverage，做法如下：
     * 1.用一个实例变量记录饮料，也就是被装饰者
     * 2.想办法让被装饰者被记录到实例变量中。这里的做法是：把饮料当做构造器参数，再由构造器将此饮料记录在实例变量中
    * @Author L
    * @Since 17:58 2020/06/14
    * @Param [beverage]
    * @return
    **/
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
    * 我们西药叙述不只是描述饮料，而是完整地连调味料都描述出来。所以首先利用委托的做法，得到一个叙述，然后在其后加上附加的叙述。
    * @Author L
    * @Since 17:59 2020/06/14
    * @Param []
    * @return java.lang.String
    **/
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
    * 妖姬算Mocha饮料的价钱，首先把调用委托给被装饰对象，以计算价钱，然后加上Mocha的价钱，得到最后结果
    * @Author L
    * @Since 18:00 2020/06/14
    * @Param []
    * @return double
    **/
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
