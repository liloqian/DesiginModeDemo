package com.xidian.OEI.state;

/**
 * Created by leo on 2017/9/17.
 */
public class InitialDemo {
    //水的三种状态
    public static final int GAS = 0;
    public static final int SOLID = 1;
    public static final int LIQUID = 2;
    //当前状态
    int state = LIQUID;
    //加热方法，只可以在固态执行，其他态都报error
    public void warm(){
        if(state == SOLID){//如果当前状态是固态就进行转变
            state = GAS; //转变完成后当前状态设为气态
            System.out.println("Ok :  warming , solid become gas");
        }else if(state == GAS){
            System.out.println("Error :   now is gas , what do you do!");
        }else if(state == LIQUID){
            System.out.println("Error  :   you need to become liquid to solid , them warm...");
        }
    }
    //液化过程，只有气态执行，其他态都报error
    public void liquidation(){
        if(state == GAS){
            state = LIQUID;
            System.out.println("OK :  liquindation , gas become liquid");
        }else if(state == LIQUID){
            System.out.println("Error :  now is liquid , what do you do!");
        }else if(state == SOLID){
            System.out.println("Error : you need to become solid to gas ,them liquidation");
        }
    }
    //凝固过程，只有液台可执行，其他态都报error
    public void sloiding(){
        if(state == LIQUID){
            state = SOLID;
            System.out.println("OK : Sloding , liquid become solid");
        }else if (state == SOLID){
            System.out.println("Error :  now is Solid , what do you do!");
        }else if(state == GAS){
            System.out.println("Error : you need to become gas to liquid ,them Sloding");
        }
    }
    //返回当前状态
    @Override
    public String toString() {
        return "Now is " + ((state == GAS) ? "gas" : ((state == LIQUID) ? "liquid" : "solid"));
    }
    //测试
    public static void main(String[] args) {
        InitialDemo demo = new InitialDemo();
        System.out.println(demo.toString()); //初始时液态，应该打印出液态信息
        demo.sloiding();
        System.out.println(demo.toString());
        demo.warm();
        System.out.println(demo.toString());
        demo.liquidation();
        System.out.println(demo.toString());
    }
}
