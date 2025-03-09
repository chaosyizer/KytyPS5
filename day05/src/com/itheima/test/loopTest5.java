package com.itheima.test;

import java.util.Random;

public class loopTest5 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i <= 100; i++) {
            int randomNum = r.nextInt(100);//生成0-99的随机数
            System.out.println(randomNum);
        }
    }
}
