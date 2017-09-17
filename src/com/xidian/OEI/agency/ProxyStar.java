package com.xidian.OEI.agency;

/**
 * Created by leo on 2017/9/17.
 */
/**代理类*/
public class ProxyStar implements Star{
    //持有真实对象的引用
    Star realStar;
    public ProxyStar(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public void sing() {
        System.out.println("proxyStar:   我去通知歌手唱歌");
        realStar.sing();
    }
    @Override
    public void getMoney() {
        System.out.println("proxyStar:   我去帮歌手收钱，然后给他");
        realStar.getMoney();
    }
}
