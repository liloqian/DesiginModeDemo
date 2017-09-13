package com.xidian.OEI.Decorate;

/**
 * Created by leo on 2017/9/13.
 */
//浓缩咖啡类型 ，继承了父类
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso coffee";
    }
    //浓缩咖啡的价格
    @Override
    public double cost() {
        return 1.9;
    }
}
