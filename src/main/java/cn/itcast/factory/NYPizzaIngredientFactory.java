package cn.itcast.factory;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:纽约原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public AbstractDough createDough() {
        return new NYDough();
    }

    public AbstractSauce createSauce() {
        return new NYSauce();
    }
}
