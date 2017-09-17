package com.xidian.OEI.state;

/**
 * Created by leo on 2017/9/17.
 */
/**Context上下文*/
public class WaterContext {
    //包含了所以的状态
    State gasState;
    State liquidState;
    State soldState;
    //当前状态
    State currentState = null;
    //在构造方法中初始化
    public WaterContext(){
        gasState = new Gas(this);
        liquidState = new Liquid(this);
        soldState = new Solid(this);
        currentState = liquidState;
    }
    public void setCurrentState(State currentState) {
        this.currentState = currentState;

    }
    public State getCurrentState() {
        return currentState;
    }
    //下面上getter()用于在状态具体实现类中改变状态时得到状态
    public State getGasState() {
        return gasState;
    }
    public State getLiquidState() {
        return liquidState;
    }
    public State getSoldState() {
        return soldState;
    }
}
