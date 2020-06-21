package chapter01.duck;

/**
 * 不会叫的实现
 *
 * @Author L
 * @Since 2020/05/23 13:47
 * @Version 1.0
 **/
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
