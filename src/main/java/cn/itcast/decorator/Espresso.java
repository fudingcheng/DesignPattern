package cn.itcast.decorator;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:Espresso饮料
 */
public class Espresso extends AbstractBeverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
