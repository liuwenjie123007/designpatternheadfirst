package chapter02;

/**
 * 酷热指数布告板
 *
 * @Author L
 * @Since 2020/05/27 8:19
 * @Version 1.0
 **/
public class HeatIndexDisplay implements Observer, DisplayElement{
    private Subject weatherData;
    private float temp;
    private float humidity;

    public HeatIndexDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        double heatIndex = 16.923 + 1.85212 * 0.1 * temp + 5.37941 * temp * humidity - 1.00254 * 0.1 * temp *  temp * humidity;
        System.out.println("Heat index is " + heatIndex);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
