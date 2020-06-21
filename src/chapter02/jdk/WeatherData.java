package chapter02.jdk;

import java.util.Observable;

/**
 * 将WeatherData改成使用java.util.Observable
 *
 * @Author L
 * @Since 2020/06/14 11:00
 * @Version 1.0
 **/
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    /**
    * 构造器不需要为了记住观察者们而建立数据结构了
    * @Author L
    * @Since 11:01 2020/06/14
    * @Param []
    * @return
    **/
    public WeatherData() {}

    public void measurementsCHanged() {
        // 在调用notifyObservers()之前， 要先调用setChanged()来知识状态已经改变
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsCHanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
