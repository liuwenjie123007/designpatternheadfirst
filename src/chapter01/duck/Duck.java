package chapter01.duck;

/**
 * 鸭子的共同机能抽象类
 *
 * @Author L
 * @Since 2020/05/23 13:38
 * @Version 1.0
 **/
public abstract class Duck {
    // 为行为接口类型声明两个引用变量，所有鸭子子类（在用一个package中）都继承他们
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    // 委托给行为类
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    // 动态设定行为
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
