package com.xidian.OEI.strategy;

/**
 * Created by leo on 2017/9/12.
 */
public class DemoOne {
    //公共父类
    abstract class Duck{
        public void Duck(){}
        //所以鸭子的游泳行为都是一致的，直接实现
        public void swim(){
            System.out.println("All duck can swim");
        }
        //鸭子的飞行动作分为三种,一种是one one one , 一种是two two two（简单模拟），一种不会飞行的
        public void fly(){
            System.out.println("i can fly by one one one");
        }
        //所有鸭子的外观都是不一样的，所以需要子类实现
        public abstract void display();
    }
    //我们写一个大白鸭子，会飞行
    class WhiteDuck extends Duck{
        //飞行行为是two two two ，所以重写父类方法
        @Override
        public void fly() {
            System.out.println("i can fly by two two two");
        }
        //外观是白色的，重写方法
        @Override
        public void display() {
            System.out.println("i am a white duck");
        }
    }
    //不会飞行的白鸭子
    class NoFly extends Duck{
        //不会飞行的鸭子fly（）空实现
        @Override
        public void fly() {
        }
        //外观是白色的，重写方法
        @Override
        public void display() {
            System.out.println("i am a white duck");
        }
    }
}
