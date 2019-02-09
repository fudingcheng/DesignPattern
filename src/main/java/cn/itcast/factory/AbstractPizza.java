package cn.itcast.factory;


import java.util.ArrayList;

/**
 * @author:fudingcheng
 * @date:2019-02-09
 * @description: 披萨抽象类
 */
public abstract class AbstractPizza {

    //名称
    String name;
    //配料
    ArrayList toppings = new ArrayList();

    //原料工厂
    PizzaIngredientFactory pizzaIngredientFactory;

    public void prepare() {
        System.out.println("准备" + name);
        System.out.println("揉面团");
        System.out.println("加酱料");

        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("烘焙30分钟");
    }

    void cut() {
        System.out.println("披萨切块");
    }

    void box() {
        System.out.println("打包披萨");
    }

    public String getName() {
        return name;
    }
}
