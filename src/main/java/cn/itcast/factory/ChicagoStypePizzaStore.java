package cn.itcast.factory;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:芝加哥披萨店
 */
public class ChicagoStypePizzaStore extends AbstractPizzaStore {


    @Override
    protected AbstractPizza createPizza() {
        return new ChicagoStylePizza(new ChicagoIngredientFactory());
    }
}
