package chapter02;

/**
 * 布告板显示接口
 *
 * @Author L
 * @Since 2020/05/26 8:15
 * @Version 1.0
 **/
public interface DisplayElement {
    // DisplayElement接口只包含了一个方法，也就是display()。当布告板需要显示时，调用此方法。
    void display();
}
