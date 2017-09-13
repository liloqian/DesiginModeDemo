package com.xidian.OEI.observer;

/**
 * Created by leo on 2017/9/12.
 */
//继承DisplayDevice接口和观察者模式没什么联系
public class BoardCallOne implements Observer ,DisplayDevice {
    private static final String TAG = "BoardCallOne";
    private float temp;
    private float humidity;
    //抽象主题主题
    private Subject weatherData ;
    public BoardCallOne(Subject weatherData) {
        this.weatherData = weatherData;
        //作为观察者，注册主题
        weatherData.registerObserver(this);
    }
    //取消注册
    public void removeRegister(){
        weatherData.removeObserver(this);
    }
    //作为观察者必须实现的方法，所有当具体主题状态变化会通知我，我本身调用display()方法，实时刷新天气信息
    @Override
    public void update(float temp, float humidity) {
        this.temp = temp;
        this.humidity = humidity;
        display();

    }
    @Override
    public void display() {
        System.out.println(TAG + " i get info from weather data {temp="+temp+",humidity="+humidity+"}");
    }
}
