package chapter02;

/**
 * 观察者接口
 *
 * @Author L
 * @Since 2020/05/26 8:12
 * @Version 1.0
 **/
public interface Observer {
    // 所有观察者都必须实现update()方法，以实现观察者接口
    void update (float temp, float humidity, float pressure);
}
