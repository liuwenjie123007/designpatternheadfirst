package chapter01.duck;

/**
 * 使用火箭动力飞行
 *
 * @Author L
 * @Since 2020/05/23 14:01
 * @Version 1.0
 **/
public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
