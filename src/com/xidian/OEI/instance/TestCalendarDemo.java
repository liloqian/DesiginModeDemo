package com.xidian.OEI.instance;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by leo on 2017/9/15.
 */
public class TestCalendarDemo {
    public static void main(String[] args) {
        //初始化100000个Date类
        long start =  System.currentTimeMillis();
        List<Date> list = new ArrayList<>(100000);
        for(int i = 0 ; i < 100000 ; i++){
            list.add(new Date());
        }
        long end = System.currentTimeMillis();
        System.out.println("初始化100000个Date 耗时"+(end - start)+"ms");
        //初始化100000个String类
        start =  System.currentTimeMillis();
        List<String> lists = new ArrayList<>(100000);
        for(int i = 0 ; i < 100000 ; i++){
            lists.add(new String(""));
        }
       end = System.currentTimeMillis();
        System.out.println("初始化100000个String 耗时"+(end - start)+"ms");
        //初始化一个Calendar类
        start = System.currentTimeMillis();
        Calendar cc = Calendar.getInstance();
        end = System.currentTimeMillis();
        System.out.println("初始化1个Calendar耗时"+(end - start)+"ms");
    }
}
