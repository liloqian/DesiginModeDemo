package com.xidian.OEI.command;

/**
 * Created by leo on 2017/9/15.
 */
public class FanCommand implements Command {
    Fan fan;
    public FanCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.on();
    }
}
