package cn.itcast.observer.customer;

/**
 * @author:fudingcheng
 * @date:2019-02-08
 * @description:观察者
 */
public interface Observer {

    public void update(float temp, float humidity, float pressure);

}
