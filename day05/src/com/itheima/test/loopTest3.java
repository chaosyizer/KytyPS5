package com.itheima.test;

import java.util.Scanner;

public class loopTest3 {
    public static void main(String[] args) {
        //键入整数X，判断是否为质数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个大于2的正整数");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(num + "是一个质数");
        }
        else {
            System.out.println(num + "不是一个质数");
        }

    }
}
