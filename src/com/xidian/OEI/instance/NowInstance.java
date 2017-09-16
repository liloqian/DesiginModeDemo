package com.xidian.OEI.instance;

/**
 * Created by leo on 2017/9/15.
 */
public class NowInstance {
    //在静态声明中进行初始化
    private static NowInstance instance = new NowInstance();
    private NowInstance(){}
    public static NowInstance getInstance(){
        return instance;
    }
}
