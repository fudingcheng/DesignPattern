package cn.itcast.decorator;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: 饮料的基类
 */
public abstract class AbstractBeverage {

    /**
     * 饮料的描述
     */
    String description = "Unknown Beverage";

    /**
     * 计算价格
     *
     * @return
     */
    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
