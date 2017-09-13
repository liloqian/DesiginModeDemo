package com.xidian.OEI.strategy;

/**
 * Created by leo on 2017/9/12.
 */
public class Demotwo {
    //定义一个飞行接口，当鸭子会飞就继承这个接口
    interface FlyBehavior{
        public void fly();
    }
    abstract class Duck{
        public void Duck(){}
        //所以鸭子的游泳行为都是一致的
        public void swim(){
            System.out.println("All duck can swim");
        }
        //所有鸭子的外观都是不一样的
        public abstract void display();
    }
    //有飞行行为，继承了飞行动作
    class WhiteDuck extends Duck implements FlyBehavior{
        @Override
        public void display() {
            System.out.println("i am a white duck");
        }
        @Override
        public void fly() {
            System.out.println("i can fly by two two two");
        }
    }
    //不会飞行，不用继承动作
    class NoGreenFlyDuck extends Duck{
        @Override
        public void display() {
            System.out.println("i am a Green duck");
        }
    }
}
