package com.xidian.OEI.simplefactory;

/**
 * Created by leo on 2017/9/14.
 */
/**简单披萨工厂*/
public class SimpleFactory {
    //就是把变化的部分提取出来放在这里，以后当需求改变时仅仅改变这个工厂方法就好了
    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equalsIgnoreCase("cheesepizza")){
            pizza = new CheesePizza();
        }else if(type.equalsIgnoreCase("clampizza")){
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
