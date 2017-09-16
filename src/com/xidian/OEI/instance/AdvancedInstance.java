package com.xidian.OEI.instance;

/**
 * Created by leo on 2017/9/15.
 */
public class AdvancedInstance {
    private static AdvancedInstance instance = null;
    private AdvancedInstance(){}
    public static AdvancedInstance getInstance(){
        if(instance == null){
            //同步操作放在这里保证了只有第一次实例化对象才进行同步操作
            synchronized (AdvancedInstance.class){
                //进入同步代码区后，再检查一次，可以解决中级代码中遇到的问题
                if(instance == null){
                    instance = new AdvancedInstance();
                }
            }
        }
        return instance;
    }
}
