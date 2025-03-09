package com.itheima.Test;

public class Test2 {
    public static void main(String[] args) {
        boolean isGreen = false;
        boolean isYellow = false;
        boolean isRed = true;

        if (isGreen) {
            System.out.println("GoGoGo!");
        } else if (isYellow) {
            System.out.println("Slow!");
        } else if (isRed) {
            System.out.println("Stop!");
        }

        //default 省略了，语法上也不会报错
        //default 可以不写在最后面，放在其他位置也可以
        //break 不能省略，否则会导致case穿透，case将失去意义
        /*case穿透流程：依旧按照顺序一个一个对比case
        如果比对成功，则正常执行，如果有break，则流程结束
        如果没有break，那么程序会执行下一个case的语句体
         */
        String noodles = "兰州拉面";

        switch (noodles){
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;
            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;
            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;
            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;
            default:
                System.out.println("吃方便面");
                break;

        }

    }
}
