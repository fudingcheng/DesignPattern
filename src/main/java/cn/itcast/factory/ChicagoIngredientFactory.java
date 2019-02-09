package cn.itcast.factory;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: 芝加哥原料工厂
 */
public class ChicagoIngredientFactory implements PizzaIngredientFactory {
    public AbstractDough createDough() {
        return new ChicagoDough();
    }

    public AbstractSauce createSauce() {
        return new ChicagoSauce();
    }
}
