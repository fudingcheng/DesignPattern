package cn.itcast.strategy;

import org.junit.Test;

/**
 * @author:fudingcheng
 * @date:2019-02-07
 * @description:测试策略模式
 */
public class StrategyTest {

    @Test
    public void test(){
        BaseDuck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
        duck.setQuackBehavior(new Squeak());
        duck.performQuack();

        System.out.println("---------------");

        duck = new ModelDuck();
        duck.performQuack();
        duck.performFly();
    }

}
