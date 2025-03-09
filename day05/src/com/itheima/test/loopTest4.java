package com.itheima.test;

import java.util.Scanner;

public class loopTest4 {
    public static void main(String[] args) {
        //判断质数，但优化算法
        //找平方根（中心）


        System.out.println("请输入一个大于2的整数");
        Scanner sc = new Scanner(System.in);

        long number = sc.nextInt();
        double squareRoot = Math.sqrt(number);
        boolean flag = true;
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println(number + "是一个质数");
        } else {
            System.out.println(number + "不是一个质数");
        }
    }
}
