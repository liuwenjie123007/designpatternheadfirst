package chapter01.duck;

/**
 * 这是飞行行为的实现，给"真会"非得鸭子用...
 *
 * @Author L
 * @Since 2020/05/23 13:41
 * @Version 1.0
 **/
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
