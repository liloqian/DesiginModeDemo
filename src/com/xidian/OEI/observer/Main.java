package com.xidian.OEI.observer;

/**
 * Created by leo on 2017/9/12.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //具体主题实现这
        WeatherData subject = new WeatherData();
        //具体观察者，在观察者的构造方法中注册了主题
        BoardCallOne boardCallOne = new BoardCallOne(subject);
        //在线程中一直让主题去通知观察者10次，每次休息1s
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0 ; i < 10 ;i++){
                    try {
                        subject.stateChanged(10.0f,18.0f);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t.start();
        //主线程休眠5s后观察者取消注册,所以结果是会打印5次消息通知
        Thread.sleep(5000);
        boardCallOne.removeRegister();
        //等待子线程结束
        t.join();
    }
}
