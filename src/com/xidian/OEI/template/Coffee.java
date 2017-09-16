package com.xidian.OEI.template;

/**
 * Created by leo on 2017/9/16.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("brew the coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("add sugar and milk");
    }
}
