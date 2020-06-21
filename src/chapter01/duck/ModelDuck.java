package chapter01.duck;

/**
 * 鸭子模型实现
 *
 * @Author L
 * @Since 2020/05/23 13:59
 * @Version 1.0
 **/
public class ModelDuck extends Duck{
    /**
    * 这是一个不会飞会叫的模型鸭...
    * @Author L
    * @Since 14:00 2020/05/23
    * @Param []
    * @return
    **/
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
