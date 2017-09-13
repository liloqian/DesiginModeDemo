package com.xidian.OEI.Decorate;

/**
 * Created by leo on 2017/9/13.
 */
//装饰者和被装饰者的公共父类
public abstract class Beverage {
    //父类状态描述
    String description = "Base Beverage";
    //具体的价格让基本咖啡类型加上装饰者的价格确定
    public abstract double cost();
    public String getDescription() {
        return description;
    }
}
