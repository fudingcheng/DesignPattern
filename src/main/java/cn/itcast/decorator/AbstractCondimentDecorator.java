package cn.itcast.decorator;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: 装饰者类, 调料类
 */
public abstract class AbstractCondimentDecorator extends AbstractBeverage{

    /**
     * 获得饮料的描述
     *
     * @return
     */
    @Override
    public abstract String getDescription();

}
