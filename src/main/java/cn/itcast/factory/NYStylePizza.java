package cn.itcast.factory;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description:纽约风格披萨
 */
public class NYStylePizza extends AbstractPizza {

    public NYStylePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        name = "纽约风格奶酪披萨";
        toppings.add("纽约配料");
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("准备" + name);
        System.out.println("加入:" + pizzaIngredientFactory.createDough().name + "面团");
        System.out.println("加入:" + pizzaIngredientFactory.createSauce().name + "酱料");
    }
}


