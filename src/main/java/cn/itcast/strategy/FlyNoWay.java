package cn.itcast.strategy;

/**
 * @author:fudingcheng
 * @date:2019-02-07
 * @description:不会飞的实现类
 */
public class FlyNoWay implements FlyBehaivor {
    public void fly() {
        System.out.println("不会飞");
    }
}
