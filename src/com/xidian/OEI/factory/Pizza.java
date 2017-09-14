package com.xidian.OEI.factory;

/**
 * Created by leo on 2017/9/14.
 */
public abstract class Pizza {
    public abstract void prepare();
    public void box() {
        System.out.println("box done ...");
    }
}
