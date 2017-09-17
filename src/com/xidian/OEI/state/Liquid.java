package com.xidian.OEI.state;

/**
 * Created by leo on 2017/9/17.
 */
/**注意，每种状态不仅仅要继承State接口，还要持有一个上下午Context的引用*/
public class Liquid implements State {
    WaterContext waterContext;
    public Liquid(WaterContext waterContext) {
        this.waterContext = waterContext;
    }
    //下面2个方法都是错误的操作
    @Override
    public void warm() {
        System.out.println("Error  :   you need to become liquid to solid , them warm...");
    }
    @Override
    public void liquidation() {
        System.out.println("Error :  now is liquid , what do you do!");
    }
    //正确的操作，所有设置转变后的状态，打印ok
    @Override
    public void sloiding() {
        waterContext.setCurrentState(waterContext.getSoldState());
        System.out.println("OK : Sloding , liquid become solid");
    }
}
