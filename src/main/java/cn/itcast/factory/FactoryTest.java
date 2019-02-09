package cn.itcast.factory;

import org.junit.Test;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:测试工厂模式
 */
public class FactoryTest {

    @Test
    public void test(){
        //芝加哥披萨店
        AbstractPizzaStore pizzaStore1 = new ChicagoStypePizzaStore();
        //订购披萨
        pizzaStore1.orderPizza();

        System.out.println("------------------------");

        //纽约披萨店
        AbstractPizzaStore pizzaStore2 = new NYStylePizzaStore();
        pizzaStore2.orderPizza();


    }

}
