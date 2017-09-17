package com.xidian.OEI.complex;

/**
 * Created by leo on 2017/9/17.
 */
public class Main {
    public static void main(String[] args) {
        QuackCounter duck1 = new QuackCounter(new RedDuck());
        QuackCounter duck2 = new QuackCounter(new WhiteDuck());
        GooseAdapter duck3 = new GooseAdapter(new Goose());

        duck1.quack();
        duck2.quack();
        duck3.quack();
        System.out.println("鸭子的数目: " + QuackCounter.getNumbersOfDuck());
    }
}
