package com.xidian.OEI.complex;

/**
 * Created by leo on 2017/9/17.
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numbersOfDuck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numbersOfDuck++;
    }
    public static int getNumbersOfDuck(){
        return numbersOfDuck;
    }
}
