package com.xidian.OEI.factory;

/**
 * Created by leo on 2017/9/14.
 */
public class Main {
    public static void main(String[] args) {
        //背景订餐系统
        PizzaStore beijing = new BEIJINGPizzaStore();
        beijing.orderPizza("cheesepizza");
        //西安订餐系统
        PizzaStore xian = new XIANPizzaStore();
        xian.orderPizza("cheesepizza");
    }
}
