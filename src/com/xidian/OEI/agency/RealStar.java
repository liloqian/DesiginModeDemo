package com.xidian.OEI.agency;

/**
 * Created by leo on 2017/9/17.
 */
/**实际劳动者*/
public class RealStar implements Star {
    @Override
    public void sing() {
        System.out.println("RealStar:  I am sing ...");
    }
    @Override
    public void getMoney() {
        System.out.println("RealStar:  I get money");
    }
}
