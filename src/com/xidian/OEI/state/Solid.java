package com.xidian.OEI.state;

/**
 * Created by leo on 2017/9/17.
 */
public class Solid implements State {
    WaterContext waterContext;
    public Solid(WaterContext waterContext) {
        this.waterContext = waterContext;
    }
    @Override
    public void warm() {
        waterContext.setCurrentState(waterContext.getGasState());
        System.out.println("Ok :  warming , solid become gas");
    }
    @Override
    public void liquidation() {
        System.out.println("Error : you need to become solid to gas ,them liquidation");
    }
    @Override
    public void sloiding() {
        System.out.println("Error :  now is Solid , what do you do!");
    }
}
