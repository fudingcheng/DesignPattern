package cn.itcast.decorator;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:Mocha调料
 */
public class Mocha extends AbstractCondimentDecorator {

    /**
     * 引用饮料
     */
    AbstractBeverage beverage;


    public Mocha(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    /**
     * 计算加Mocha的价格
     *
     * @return
     */
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
