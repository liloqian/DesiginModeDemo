package com.xidian.OEI.command;

/**
 * Created by leo on 2017/9/15.
 */
/**CreateCommand*/
public class LightCommand implements Command {
    //持有一份接受者Receiver中Light的引用
    Light light ;
    public LightCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }
}
