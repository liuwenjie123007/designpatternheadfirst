package chapter02;

/**
 * 主题接口
 *
 * @Author L
 * @Since 2020/05/26 8:11
 * @Version 1.0
 **/
public interface Subject {
    // 这两个方法都需要一个观察者作为变量，该观察者是用来注册或被注册的
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    // 当主题状态改变时，这个方法会被调用，以通知所有的观察者
    void notifyObservers();
}
