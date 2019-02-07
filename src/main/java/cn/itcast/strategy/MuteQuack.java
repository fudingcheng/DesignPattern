package cn.itcast.strategy;

/**
 * @author:fudingcheng
 * @date:2019-02-07
 * @description:不会叫
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("不会叫");
    }
}
