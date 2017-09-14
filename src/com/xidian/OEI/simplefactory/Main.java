package com.xidian.OEI.simplefactory;

/**
 * Created by leo on 2017/9/14.
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimpleFactory());
        store.orderPizza("cheesepizza");
        System.out.println("---------------------------------------");
        store.orderPizza("clampizza");
    }
}
