package cn.itcast.decorator;

import org.junit.Test;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:测试装饰者模式
 */
public class DecorateTest {

    @Test
    public void test() {
        //HouseBlend饮料
        AbstractBeverage beverage = new HouseBlend();
        show(beverage, "$");

        //Espresso饮料
        AbstractBeverage beverage2 = new Espresso();
        show(beverage2, "$");
        //使用Mocha装饰Espresso(Espresso加入Mocha调料)
        beverage2 = new Mocha(beverage2);
        show(beverage2, "$");

        AbstractBeverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);

        show(beverage3, "$");
    }

    private void show(AbstractBeverage beverage, String s) {
        System.out.println(beverage.getDescription() + " ," + s + ":" + beverage.cost());
    }
}
