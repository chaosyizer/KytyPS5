package com.itheima.Test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围的结束");
        int end = sc.nextInt();

        int sum = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count ++;
                System.out.println("i = " + i + "，符合条件\ncount = " + count + "，此时sum =" + sum);
                sum = sum + i;
                System.out.println("sum = sum + i = " + sum);
            }
        }
    }
}
