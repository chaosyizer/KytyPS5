package com.itheima.Test;

public class Test15 {
    public static void main(String[] args) {
        int sum2 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i);
                sum2 = sum2 + i;
                System.out.println("sum2 = sum2 + i\n" + sum2);
            }
        }
    }
}
