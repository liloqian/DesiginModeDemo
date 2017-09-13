package com.xidian.OEI.strategy;

/**
 * Created by leo on 2017/9/12.
 */
public class Main {
    //现在鸭子子类只需要从重写外观方法，因为每个鸭子外观不同
    static class FlyWhiteDuck extends Duck{
        @Override
        public void display() {
            System.out.println("i am a white duck");
        }
    }
    public static void main(String[] args) {
        Duck flyOneWhiteDuck = new FlyWhiteDuck();
        //fly()行为通过设置接口的实现类改变
        flyOneWhiteDuck.setmFlyBehavior(new FlyOne());
        flyOneWhiteDuck.fly();
        flyOneWhiteDuck.setmFlyBehavior(new FlyTwo());
        flyOneWhiteDuck.fly();
        flyOneWhiteDuck.setmFlyBehavior(new FlyNo());
        flyOneWhiteDuck.fly();
    }
}
