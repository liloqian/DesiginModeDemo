package com.xidian.OEI.simplefactory;

/**
 * Created by leo on 2017/9/14.
 */
/**披萨订单系统*/
public class PizzaStore {
    SimpleFactory factory;
    //传入我们上面的简单工厂
    public PizzaStore(SimpleFactory factory) {
        this.factory = factory;
    }
    //预定披萨
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.box();
        return pizza;
    }
}
