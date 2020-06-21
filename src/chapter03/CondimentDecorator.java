package chapter03;

/**
 * 首先，必须让CondimentDecorator能够取代Beverage, 所以将CondimentDecorator扩展自Beverage类
 *
 * @Author L
 * @Since 2020/06/14 17:47
 * @Version 1.0
 **/
public abstract class CondimentDecorator extends Beverage{
    /**
    * 所有的调料装饰者都必须重新实现setDescription()方法
    * @Author L
    * @Since 17:49 2020/06/14
    * @Param []
    * @return java.lang.String
    **/
    public abstract String getDescription();
}
