package cn.itcast.factory;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: 纽约披萨店
 */
public class NYStylePizzaStore extends AbstractPizzaStore {

    @Override
    protected AbstractPizza createPizza() {
        return new NYStylePizza(new NYPizzaIngredientFactory());
    }
}
