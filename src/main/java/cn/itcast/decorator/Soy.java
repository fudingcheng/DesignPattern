package cn.itcast.decorator;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:Soy调料
 */
public class Soy extends AbstractCondimentDecorator {

    /*
     *引用饮料
     */
    AbstractBeverage beverage;

    public Soy(AbstractBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }
}
