package com.itheima.test;

public class loopTest1 {
    public static void main(String[] args) {
        //逢七过 某数位包含7或者是7的倍数的数，喊“过”
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i / 10 % 10 == 7 || i % 10 == 7) {
                System.out.println("过");
                continue;
            }
            System.out.println(i);

        }
    }
}
