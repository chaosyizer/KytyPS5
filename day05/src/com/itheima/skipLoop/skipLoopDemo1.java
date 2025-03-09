package com.itheima.skipLoop;

public class skipLoopDemo1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;//结束本次循环，继续下次循环
            }

            System.out.println("吃第" + i + "个包子");

        }
    }
}
