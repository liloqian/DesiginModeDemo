package com.xidian.OEI.template;

/**
 * Created by leo on 2017/9/16.
 */
/**具体模板类，实现了tea特性的操作*/
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("brew the tea");
    }
    @Override
    void addCondiments() {
        System.out.println("add lemon");
    }
}
