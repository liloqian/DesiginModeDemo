package com.xidian.OEI.factory;

/**
 * Created by leo on 2017/9/14.
 */
/**北京的订餐系统*/
public class BEIJINGPizzaStore extends PizzaStore {
    /**返回的是北京口味的披萨*/
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheesepizza")){
            pizza = new BEIJINGCheesePizza();
        }
        return pizza;
    }
}
