package com.itheima.ifdemo;

public class IfDemo2 {
    public static void main(String[] args) {
        int number = 10;
        if (number >= 10) {
            System.out.println("number = " + number + " 满足大于等于10");
        }


        //bool类型的变量，在做判断的时候，不要用==进行判断，直接使用变量本身即可。
        boolean flag = true;
        if (flag) {
            System.out.println("flag的值为true");
        }
    }
}
