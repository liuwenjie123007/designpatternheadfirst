package chapter01.duck;

/**
 * 测试类
 *
 * @Author L
 * @Since 2020/05/23 13:55
 * @Version 1.0
 **/
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        // 动态的让不会飞的模型鸭子变成可用火箭动力飞行！
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
