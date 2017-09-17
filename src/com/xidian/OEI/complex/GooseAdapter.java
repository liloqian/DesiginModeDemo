package com.xidian.OEI.complex;

/**
 * Created by leo on 2017/9/17.
 */
//适配器模式
public class GooseAdapter implements Quackable {
    Goose goose;
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
