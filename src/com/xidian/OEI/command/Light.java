package com.xidian.OEI.command;

/**
 * Created by leo on 2017/9/15.
 */
/**Receiver  具体的命令接收者，接受者指导如何进行必要的工作，也是真正执行命令的方法*/
public class Light {
    //实现了这个方法都可以成为命令接收者，这个方法是真正执行命令的方法
    public void on(){
        System.out.println(this.toString()+":  turn on the light");
    }
    @Override
    public String toString() {
        return "I-am-light";
    }
}
