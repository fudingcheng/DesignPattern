package cn.itcast.factory;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:芝加哥风格披萨
 */
public class ChicagoStylePizza extends AbstractPizza {

    public ChicagoStylePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "芝加哥风格奶酪披萨";
        toppings.add("芝加哥配料");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("准备" + name);
        System.out.println("加入:" + pizzaIngredientFactory.createDough().name + "面团");
        System.out.println("加入:" + pizzaIngredientFactory.createSauce().name + "酱料");
    }

    @Override
    void cut() {
        System.out.println("芝加哥披萨被切成了正方形");
    }
}
