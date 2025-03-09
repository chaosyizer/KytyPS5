package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class loopTest7 {
    public static void main(String[] args) {
        Random r = new Random();
        //randomNum为1-100的随机数，包含两端的
        //相对于loopTest6，增加保底机制，连续5次没有猜对，就直接算猜对，告知答案并退出循环
        int randomNum = r.nextInt(100) + 1;
        System.out.println("输入你要猜的数字1-100");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num != randomNum) {
            count ++;
            if (num < randomNum) {
                System.out.println("你猜的数字比实际的小");
            } else if (num > randomNum) {
                System.out.println("你猜的数字比实际的大");
            }
            if(count == 5){
                System.out.println("正确的数字为"+randomNum);
                break;
            }
            System.out.println("还剩"+(5-count)+"次机会");
            System.out.println("再次输入你要猜的数字");
            num = sc.nextInt();
        }
        if (num == randomNum){
            System.out.println("猜中了");
        }
    }
}
