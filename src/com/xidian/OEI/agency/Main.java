package com.xidian.OEI.agency;

/**
 * Created by leo on 2017/9/17.
 */
public class Main {
    public static void main(String[] args) {
        //客户和代理类交流，代理类持有真实对象
        Star star = new ProxyStar(new RealStar());
        star.sing();
        star.getMoney();
    }
}
