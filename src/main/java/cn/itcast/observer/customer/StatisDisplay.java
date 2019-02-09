package cn.itcast.observer.customer;

/**
 * @author:fudingcheng
 * @date:2019-02-08
 * @description:观察者:统计气象数据
 */
public class StatisDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    private Subject weatherData;

    public StatisDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //注册为观察者
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("StatisDisplay: 温度:" + temperature + ",湿度:" + humidity + ",气压:" + pressure);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
