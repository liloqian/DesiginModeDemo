package com.xidian.OEI.state;

/**
 * Created by leo on 2017/9/17.
 */
/**注意，每种状态不仅仅要继承State接口，还要持有一个上下午Context的引用*/
public class Gas implements State {
    WaterContext waterContext ;
    public Gas(WaterContext waterContext) {
        this.waterContext = waterContext;
    }
    //错误操作
    @Override
    public void warm() {
        System.out.println("Error :   now is gas , what do you do!");
    }
    //正确的操作
    @Override
    public void liquidation() {
        waterContext.setCurrentState(waterContext.getLiquidState());
        System.out.println("OK :  liquindation , gas become liquid");
    }
    //错误的操作
    @Override
    public void sloiding() {
        System.out.println("Error : you need to become gas to liquid ,them Sloding");
    }
}
