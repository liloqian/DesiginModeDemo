package com.xidian.OEI.Decorate;

/**
 * Created by leo on 2017/9/13.
 */
//混合咖啡
public class Blend extends Beverage {
    public Blend() {
        description = "Blend coffee";
    }
    //混合咖啡价格
    @Override
    public double cost() {
        return 2.9;
    }
}
