package cn.itcast.strategy;

/**
 * @author:fudingcheng
 * @date:2019-02-07
 * @description:模型鸭
 */
public class ModelDuck extends BaseDuck {

    public ModelDuck() {
        flyBehaivor = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("模型鸭");
    }
}
