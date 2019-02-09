package cn.itcast.decorator;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: Whip调料
 */
public class Whip extends AbstractCondimentDecorator {

    /**
     * 饮料引用
     */
    AbstractBeverage beverage;

    public Whip(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
