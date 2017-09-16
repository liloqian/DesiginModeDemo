package com.xidian.OEI.command;

/**
 * Created by leo on 2017/9/15.
 */
/**另外一个接受者*/
public class Fan {
    public void on(){
        System.out.println(this.toString()+":  turn on the fan");
    }
    @Override
    public String toString() {
        return "I-am-fan";
    }
}
