package com.xidian.OEI.adapter;

/**
 * Created by leo on 2017/9/15.
 */
public class Main {
    public static void main(String[] args) {
        //真实的鸭子类
        WhiteDuck whiteDuck = new WhiteDuck();
        //表面和实际上都是鸭子的行为
        whiteDuck.gagaga();
        //鸡适配的鸭子类
        DuckAdapter turkey = new DuckAdapter(new WhiteTurkey());
        //表面看起来是鸭子的gaga()方法，实际却是鸡在学鸭子叫
        turkey.gagaga();
    }
}
