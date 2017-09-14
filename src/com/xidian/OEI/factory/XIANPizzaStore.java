package com.xidian.OEI.factory;

/**
 * Created by leo on 2017/9/14.
 */
/**西安订餐系统*/
public class XIANPizzaStore extends PizzaStore {
    /**返回的是西安口味的披萨*/
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheesepizza")){
            pizza = new XIANCheesePizza();
        }
        return pizza;
    }
}
