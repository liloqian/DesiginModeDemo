package com.xidian.OEI.template;

/**
 * Created by leo on 2017/9/16.
 */
public class Main {
    public static void main(String[] args) {
        //准备tea
        System.out.println("Prepare the tea ...");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe(); //只要调用模板的方法，不关心怎么实现的
        //准备coffee
        System.out.println("Prepare the coffee...");
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
