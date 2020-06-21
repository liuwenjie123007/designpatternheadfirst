package chapter02;

/**
 * 测试程序
 *
 * @Author L
 * @Since 2020/05/27 8:16
 * @Version 1.0
 **/
public class WeatherStation {
    public static void main(String[] args) {
        // 首先建立一个WeatherData对象
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);


    }
}
