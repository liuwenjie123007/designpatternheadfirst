package chapter01.duck;

/**
 * 鸭子的普通叫声
 *
 * @Author L
 * @Since 2020/05/23 13:46
 * @Version 1.0
 **/
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
