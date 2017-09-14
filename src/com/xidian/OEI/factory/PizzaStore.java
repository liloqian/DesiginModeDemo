package com.xidian.OEI.factory;

/**
 * Created by leo on 2017/9/14.
 */
/**订餐系统*/
public abstract class PizzaStore {
    public  void orderPizza(String type){
        Pizza pizza ;
        /**披萨的类型有子类去具体实现*/
        pizza = createPizza(type);
        pizza.prepare();
        pizza.box();
    }
    public abstract Pizza createPizza(String type);
}
