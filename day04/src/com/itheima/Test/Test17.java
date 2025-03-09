package com.itheima.Test;

public class Test17 {
    public static void main(String[] args) {
        double height = 8844430;
        double paper = 0.1;
        int count = 0;

        while (paper < height) {
            System.out.println("paper = " + paper);
            count++;
            paper = paper * 2;
        }
        System.out.println("count = " + count);
    }
}
