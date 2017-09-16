package com.xidian.OEI.template;

/**
 * Created by leo on 2017/9/16.
 */
/**抽象父类*/
public abstract class CaffeineBeverage {
    /**模板方法，对外提供的接口*/
    public final void prepareRecipe() {
        if(isNeedBoilWater()){
            boilWater();
        }
        brew();
        pourInCup();
        addCondiments();
    }
    //改变的部分让子类去实现
    abstract void brew();
    abstract void addCondiments();
    //固定的部分直接实现，使用private关键字让外部无法调用
    // final关键字是让子类重写改变这个方法
    private final void boilWater() {
        System.out.println("boil the water");
    }
    private final void pourInCup() {
        System.out.println("pour in cup");
    }
    //不是呀final让子类可以改变
    private boolean isNeedBoilWater(){
        return true;
    }
}
