package com.xidian.OEI.strategy;

/**
 * Created by leo on 2017/9/12.
 */
public abstract class Duck {
    FlyBehavior mFlyBehavior;
    public Duck() {
    }
    //每个鸭子子类的外观都不一样，只能让子类自己去实现
    public abstract void display();
    //公共行为
    public void swim(){
        System.out.println("All duck can swim");
    }
    //直接使用接口的方法，针对接口编程
    public void fly(){
       if(mFlyBehavior != null){
           mFlyBehavior.fly();
       }
    }
    //通过该setter方法设置不同的飞行实现类，改变不同的飞行行为
    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {
        this.mFlyBehavior = mFlyBehavior;
    }
}
