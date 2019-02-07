package cn.itcast.strategy;

/**
 * @author:fudingcheng
 * @date:2019-02-07
 * @description:嘎嘎叫行为
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
