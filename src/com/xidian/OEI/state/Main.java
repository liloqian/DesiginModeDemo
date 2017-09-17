package com.xidian.OEI.state;

/**
 * Created by leo on 2017/9/17.
 */
public class Main {
    public static void main(String[] args) {
//        //正确的执行，我们在WaterContext中初始化状态为liquid
//        WaterContext waterContext = new WaterContext();
//        //liquid -> sold
//        waterContext.getCurrentState().sloiding();
//        //sold -> gas
//        waterContext.getCurrentState().warm();
//        // gas->liquid
//        waterContext.getCurrentState().liquidation();
        //正确的执行，我们在WaterContext中初始化状态为liquid
        WaterContext waterContext = new WaterContext();
        //liquid无法执行warm，状态还是液体
        waterContext.getCurrentState().warm();
        //liquid -> sold
        waterContext.getCurrentState().sloiding();
        // 当前是sold，无法执行liquidation()操作
        waterContext.getCurrentState().liquidation();
    }
}
