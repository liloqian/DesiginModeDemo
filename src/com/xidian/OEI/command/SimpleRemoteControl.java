package com.xidian.OEI.command;

/**
 * Created by leo on 2017/9/15.
 */
/**Invoker 持有一个命令对象，当点击按钮时就执行命令对象的方法*/
public class SimpleRemoteControl {
    //命令对象
    Command command;
    //点击按钮后调用此方法去调用命令对象实现的方法
    public void buttonPressed(){
        command.execute();
    }
    public void setCommand(Command command) {
        this.command = command;
    }
}
