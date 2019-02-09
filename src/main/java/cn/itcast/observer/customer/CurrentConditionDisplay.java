package cn.itcast.observer.customer;

/**
 * @author:fudingcheng
 * @date:2019-02-08
 * @description:观察者,当前天气
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 引用主题对象
     */
    private Subject weatherData;

    /**
     * 构造方法
     *
     * @param weatherData
     */
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        //注册为观察者
        weatherData.registerObserver(this);
    }

    /**
     * 显示气象数据方法
     */
    public void display() {
        System.out.println("Current Condition: 温度:" + temperature + ",湿度:" + humidity + ",气压:" + pressure);
    }

    /**
     * 更新显示面板信息
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();

    }
}
