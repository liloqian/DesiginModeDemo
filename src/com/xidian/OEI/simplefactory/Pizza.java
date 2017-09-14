package com.xidian.OEI.simplefactory;

/**
 * Created by leo on 2017/9/14.
 */
/**pizza 的父类*/
public abstract class Pizza  {
    //每个pizza的准备方法不一样
    public abstract void prepare();
    public void box() {
        System.out.println("box done ...");
    }
}
