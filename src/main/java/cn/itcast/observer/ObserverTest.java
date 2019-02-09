package cn.itcast.observer;

import cn.itcast.observer.customer.CurrentConditionDisplay;
import cn.itcast.observer.customer.StatisDisplay;
import cn.itcast.observer.customer.WeatherData;
import cn.itcast.observer.jdk.GeneralDisplay;
import cn.itcast.observer.jdk.StatisticsDisplay;
import org.junit.Test;

/**
 * @author:fudingcheng
 * @date:2019-02-08
 * @description:测试观察者类
 */
public class ObserverTest {

    @Test
    public void testCustomerObverser() {
        //主题对象:气象站
        WeatherData weatherData = new WeatherData();

        //观察者:统计天气数据
        StatisDisplay statisDisplay = new StatisDisplay(weatherData);

        //观察者:当前天气
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);


        weatherData.setMeasurements(30, 50, 100);
        weatherData.setMeasurements(31, 51, 101);
        weatherData.setMeasurements(32, 52, 102);

    }

    @Test
    public void testJdkObserver(){
        cn.itcast.observer.jdk.WeatherData weatherData = new cn.itcast.observer.jdk.WeatherData();
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(30, 50, 100);
        weatherData.setMeasurements(31, 51, 101);
        weatherData.setMeasurements(32, 52, 102);
    }

}
