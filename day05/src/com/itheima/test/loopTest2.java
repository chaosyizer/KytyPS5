package com.itheima.test;

import java.util.Scanner;

public class loopTest2 {
    public static void main(String[] args) {
        //开根，但是只保留整数部分，只四舍不五入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();

        for (int i = 0; ; i++) {
            if (i * i == num) {
                System.out.println(num + "的平方根就是" + i);
                break;

            }
            if (i * i < num && (i + 1) * (i + 1) > num) {
                System.out.println(num + "的平方根的整数部分为" + i);
                break;
            }
        }
    }
}
