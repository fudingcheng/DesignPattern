package cn.itcast.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private Observable observable;

    private float temperature;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if (o instanceof Observable) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("StatisDisplay: 温度:" + temperature + ",湿度:" + humidity + ",气压:" + pressure);
    }
}
