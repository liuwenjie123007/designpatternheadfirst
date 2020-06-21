package chapter01.duck;

/**
 * 绿头鸭，鸭子的一个实现
 *
 * @Author L
 * @Since 2020/05/23 13:53
 * @Version 1.0
 **/
public class MallardDuck extends Duck{
    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
