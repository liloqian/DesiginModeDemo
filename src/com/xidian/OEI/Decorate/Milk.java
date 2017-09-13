package com.xidian.OEI.Decorate;

/**
 * Created by leo on 2017/9/13.
 */
public class Milk extends Spices {
    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
    @Override
    public String getDescription() {
        return "Milk "+beverage.getDescription();
    }
}
