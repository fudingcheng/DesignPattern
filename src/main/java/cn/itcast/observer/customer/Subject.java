package cn.itcast.observer.customer;

/**
 * @author:fudingcheng
 * @date:2019-02-08
 * @description:主题
 */
public interface Subject {

    /**
     * 注册观察者
     *
     * @param o
     */
    public void registerObserver(Observer o);

    /**
     * 移除观察者
     *
     * @param o
     */
    public void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    public void notifyObserver();

}
