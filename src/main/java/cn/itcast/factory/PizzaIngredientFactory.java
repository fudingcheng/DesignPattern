package cn.itcast.factory;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: 原料工厂接口
 */
public interface PizzaIngredientFactory {
    public AbstractDough createDough();
    public AbstractSauce createSauce();
}
