package chapter02;

import java.util.ArrayList;

/**
 * 气象站数据类，实现了主题接口
 *
 * @Author L
 * @Since 2020/05/26 8:17
 * @Version 1.0
 **/
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    // 我们加上一个ArrayList来记录观察者，次ArrayList是在构造器中建立的
    public WeatherData() {
        observers = new ArrayList<>();
    }

    // 当注册观察者时，我们只要把它加到ArrayList的后面即可
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    // 同样的，当观察者想取消注册，我们把它从ArrayList中删除即可。
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0)
            observers.remove(i);
    }

    // 在这里，我们把状态告诉每一个观察者。因为观察者都实现了update(),所以我们知道如何通知他们
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    // 当从气象站得到更新观察值时，我们通知观察者
    public void measurementsChanged() {
        notifyObservers();
    }

    // 当测量数据时，调用此接口设置数据
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
