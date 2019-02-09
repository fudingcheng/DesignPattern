package cn.itcast.observer.customer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:fudingcheng
 * @date:2019-02-08
 * @description: 气象站类, 被观察者
 */
public class WeatherData implements Subject {

    /**
     * 观察者集合
     */
    private List observers;

    private float temperature;

    private float humidity;

    private float pressure;

    /**
     * 构造方法,初始化观察者集合容器
     */
    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 注册观察者
     *
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除观察者
     *
     * @param o
     */
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i > -1) {
            observers.remove(o);
        }
    }

    /**
     * 通知观察者
     */
    public void notifyObserver() {
        for (Object obj : observers) {
            Observer observer = (Observer) obj;
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * 测量数据改变后,通知观察者
     */
    public void measurementsChanged() {
        notifyObserver();
    }


    /**
     * 更改测量数据
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


}
