package com.itheima.skipLoop;

public class skipLoopDemo2 {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            System.out.println("吃第"+i+"个包子");

            if(i==3){
                break;//结束整个循环
            }

        }
    }
}
