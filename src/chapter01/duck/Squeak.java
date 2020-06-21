package chapter01.duck;

/**
 * 吱吱叫的实现....
 *
 * @Author L
 * @Since 2020/05/23 13:48
 * @Version 1.0
 **/
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
