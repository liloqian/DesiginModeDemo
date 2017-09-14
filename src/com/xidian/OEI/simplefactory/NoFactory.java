package com.xidian.OEI.simplefactory;

/**
 * Created by leo on 2017/9/14.
 */
public class NoFactory {
    //type为披萨类型
    private static Pizza orderPizza(String type){
        Pizza pizza = null;
        //if .. else if... 但是披萨的类型是一直在改变增加，所以我们要引用工厂模式
        if(type.equalsIgnoreCase("cheesepizza")){
            pizza = new CheesePizza();
        }else if(type.equalsIgnoreCase("clampizza")){
            pizza = new ClamPizza();
        }
        return pizza;
    }
    public static void main(String[] args) {
        //我们点了一份奶酪披萨
        Pizza pizza = orderPizza("cheesepizza");
        pizza.prepare();
        pizza.box();
    }
}
