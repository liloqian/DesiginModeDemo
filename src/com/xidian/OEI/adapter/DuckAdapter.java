package com.xidian.OEI.adapter;

/**
 * Created by leo on 2017/9/15.
 */
/**实现目标抽象类的接口，穿上一层衣服*/
public class DuckAdapter implements Duck {
    //适配者类的引用
    Turkey turkey;
    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    //在鸭子的行为实际是鸡的行为，冒充...
    @Override
    public void gagaga() {
        turkey.gege();
    }
}
