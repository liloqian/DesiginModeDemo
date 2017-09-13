package com.xidian.OEI.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leo on 2017/9/12.
 */
public class WeatherData implements Subject  {
    //观察者集合
    private List<Observer> observers;
    //模拟自身状态，当这些状态改变时通知所有观察者
    private float temperature;
    private float humidity;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    //模拟状态改变通知所有观察者
    public void stateChanged(float temp , float humidity){
        this.temperature = temp;
        this.humidity = humidity;
        notifyAllObserver();
    }
    //模拟状态改变通知所有观察者
    public void stateChanged(){
        notifyAllObserver();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }
    @Override
    public void notifyAllObserver() {
        for(Observer o : observers){
            //这里很关键，这里调用的是抽象观察者的方法，不需要明白谁是观察者，只要继承了Observer的类就可以
            o.update(temperature , humidity);
        }
    }
}
