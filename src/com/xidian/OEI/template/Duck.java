package com.xidian.OEI.template;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by leo on 2017/9/16.
 */
/**继承了Comparable接口，Duck类可以使用sort方法*/
public class Duck implements Comparable{
    //在comparTo()中使用这个int类型排序
    int weight;
    public Duck(int weight) {
        this.weight = weight;
    }
    @Override
    public int compareTo(Object o) {
        Duck oDuck = (Duck) o;
        if(this.weight > oDuck.weight){
            return 1;
        }else if(this.weight == oDuck.weight){
            return 0;
        }else {
            return  -1;
        }
    }
    //重写了toString()后面的打印中使用
    @Override
    public String toString() {
        return "my weight is " + this.weight;
    }
    //测试main
    public static void main(String[] args) {
        //new个ArrayList
        List<Duck> ducks = new ArrayList<>();
        for(int i =0 ; i < 10 ;i++){
            ducks.add(new Duck((int)(Math.random()*100)));
        }
        //未排序前打印集合信息
        show(ducks);
        System.out.println("\n\n");
        //排序
        Collections.sort(ducks);
        //排序后再次打印
        show(ducks);
    }
    //打印集合信息
    private static void show(List<Duck> lists){
        for (Duck duck : lists) {
            System.out.println(duck.toString());
        }
    }
}
