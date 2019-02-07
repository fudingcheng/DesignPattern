package cn.itcast.strategy;

/**
 * @author:fudingcheng
 * @date:2019-02-07
 * @description: 吱吱叫行为
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("吱吱叫");
    }
}
