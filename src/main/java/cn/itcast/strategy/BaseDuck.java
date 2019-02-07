package cn.itcast.strategy;

/**
 * @author:fudingcheng
 * @date:2019-02-07
 * @description: 鸭子的超类
 */
public abstract class BaseDuck {
    /**
     * 飞行行为
     */
    FlyBehaivor flyBehaivor;

    /**
     * 叫的行为
     */
    QuackBehavior quackBehavior;

    public BaseDuck() {
    }

    /**
     * 飞行
     */
    public void performFly() {
        flyBehaivor.fly();
    }

    /**
     * 叫
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 表演行为,每个鸭子都可以表演,但是表演的内容不同
     */
    public abstract void display();

    /**
     * 所有的鸭子都会游泳,并且游泳的行为都一样
     */
    public void swim() {
        System.out.println("所有的鸭子都会游泳");
    }

    public void setFlyBehaivor(FlyBehaivor flyBehaivor) {
        this.flyBehaivor = flyBehaivor;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
