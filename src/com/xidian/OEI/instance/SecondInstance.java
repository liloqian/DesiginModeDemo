package com.xidian.OEI.instance;

/**
 * Created by leo on 2017/9/15.
 */
public class SecondInstance {
    //在不需要的时候不需要初始化
    private static SecondInstance instance = null;
    //构造方法设为private，外部无法初始化
    private SecondInstance(){}
    //得到PrimaryInstance唯一的方法
    public static synchronized SecondInstance getInstance(){
        if(instance == null){
            instance = new SecondInstance();
        }
        return instance;
    }
}
