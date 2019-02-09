package cn.itcast.observer.jdk;


import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:
 */
public class GeneralDisplay implements Observer, DisplayElement {

    Observable observable;

    private float temperature;
    private float humidity;
    private float pressure;

    public GeneralDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
/*        //从主题对象拉取数据
        if (o instanceof Observable) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }*/

        //接受主题对象推送的数据
        List list = (List) arg;
        Float[] objects = (Float[]) list.toArray(new Float[0]);
        this.temperature =objects[0];
        this.humidity = objects[1];
        this.pressure = objects[2];
        display();
    }

    public void display() {
        System.out.println("GeneralDisplay: 温度:" + temperature + ",湿度:" + humidity + ",气压:" + pressure);
    }
}
