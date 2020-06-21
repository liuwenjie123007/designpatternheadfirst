package chapter02;

/**
 * 实时监控布告板
 *
 * @Author L
 * @Since 2020/05/27 8:10
 * @Version 1.0
 **/
public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    // 构造器需要weatherData对象（也就是主题）作为注册之用
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        // display()方法就知识把最近温度和湿度显示出来
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        // 当update()调用时，我们把温度和湿度保存起来，然后调用display();
        display();
    }
}
