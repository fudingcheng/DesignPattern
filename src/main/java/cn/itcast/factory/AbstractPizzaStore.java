package cn.itcast.factory;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: 披萨店类
 */
public abstract class AbstractPizzaStore {

    /**
     * 订购披萨
     *
     * @return
     */
    public AbstractPizza orderPizza() {
        AbstractPizza pizza = createPizza();
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 制作披萨
     *
     * @return
     */
    protected abstract AbstractPizza createPizza();

}
