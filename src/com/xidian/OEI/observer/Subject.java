package com.xidian.OEI.observer;

/**
 * Created by leo on 2017/9/12.
 */
/**主题接口，所有继承该接口的类都可以称为主题，就是被*/
public interface Subject {
    //该方法把任意的观察者加入到观察者集合
    public void registerObserver(Observer o);
    //该方法把观察者从观察者从集合中除去，从此收不到状态改变
    public void removeObserver(Observer o);
    //当状态改变时通过观察者集合中的所以观察者
    public void notifyAllObserver();
}
