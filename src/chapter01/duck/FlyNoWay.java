package chapter01.duck;

/**
 * 这是飞行行为的实现，给"不会"非得鸭子用。（包括橡皮鸭，诱饵鸭）
 *
 * @Author L
 * @Since 2020/05/23 13:42
 * @Version 1.0
 **/
public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
