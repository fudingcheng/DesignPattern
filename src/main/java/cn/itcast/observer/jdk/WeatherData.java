package cn.itcast.observer.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: 主题:气象站
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    /**
     * 通知观察者方法
     */
    public void measurementsChanged() {
        setChanged();
        //封装数据,推送给观察者
        List<Float> objs = new ArrayList<Float>();
        objs.add(temperature);
        objs.add(humidity);
        objs.add(pressure);
        notifyObservers(objs);
    }

    /**
     * 测量数据方法
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }
}
