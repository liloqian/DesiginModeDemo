package com.xidian.OEI.Decorate;

/**
 * Created by leo on 2017/9/13.
 */
public class Sugar extends Spices {
    Beverage beverage;
    //我们用父类，不要基本的咖啡类型
    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }
    //修饰咖啡名称状态， 修饰属性+基本属性
    @Override
    public String getDescription() {
        return "Sugar " + beverage.getDescription();
    }
    //修饰咖啡价格  糖的价格加上自身本来价格
    @Override
    public double cost() {
        return .5 + beverage.cost();
    }
}
