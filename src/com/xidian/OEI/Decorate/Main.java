package com.xidian.OEI.Decorate;

/**
 * Created by leo on 2017/9/13.
 */
public class Main {
    public static void main(String[] args) {
        //普通的混合咖啡
        Beverage blend = new Blend();
        printInfo(blend);
        //加了一份牛奶的混合咖啡
        Beverage blendMilk = new Milk(blend);
        printInfo(blendMilk);
        //加了2份糖的一份牛奶的混合咖啡
        Beverage blendMilkSugarTwo = new Sugar(new Sugar(blendMilk));
        printInfo(blendMilkSugarTwo);
        //加了一份糖一份牛奶的浓缩咖啡
        Beverage espresson = new Sugar(new Milk(new Espresso()));
        printInfo(espresson);
    }
    //提取打印咖啡的打印方法
    private static void printInfo(Beverage beverage){
        System.out.println(beverage.getDescription() +"   价格:"+beverage.cost());
    }
}
