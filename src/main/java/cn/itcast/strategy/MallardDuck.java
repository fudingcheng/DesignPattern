package cn.itcast.strategy;

/**
 * @author:fudingcheng
 * @date:2019-02-07
 * @description: 绿头鸭
 */
public class MallardDuck extends BaseDuck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehaivor = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("我是绿头鸭");
    }
}
