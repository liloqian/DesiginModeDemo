package com.xidian.OEI.command;

/**
 * Created by leo on 2017/9/15.
 */
public class Main {
    public static void main(String[] args) {
        //实例化一个命令调用者
        SimpleRemoteControl remote = new SimpleRemoteControl();
        //电灯命令
        LightCommand lightOn = new LightCommand(new Light());
        //设置电灯命令，点击按钮去执明LightCommand的方法
        remote.setCommand(lightOn);
        remote.buttonPressed();
        //下面的和上面的一样
        FanCommand fanOn = new FanCommand(new Fan());
        remote.setCommand(fanOn);
        remote.buttonPressed();
    }
}
