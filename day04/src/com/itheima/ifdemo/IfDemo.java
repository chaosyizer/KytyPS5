package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        System.out.println("你能和几斤酒？");
        Scanner sc = new Scanner(System.in);
        int wine = sc.nextInt();
        if (wine > 2) {
            System.out.println("好样的");
        } else {
            System.out.println("不够");
        }
    }
}
