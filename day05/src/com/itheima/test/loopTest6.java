package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class loopTest6 {
    public static void main(String[] args) {
        Random r = new Random();
        //randomNum为1-100的随机数，包含两端的
        int randomNum = r.nextInt(100) + 1;
        System.out.println("输入你要猜的数字1-100");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num!=randomNum){
            if (num<randomNum){
                System.out.println("你猜的数字比实际的小");
            }
            else if(num>randomNum){
                System.out.println("你猜的数字比实际的大");
            }
            System.out.println("再次输入你要猜的数字");
            num = sc.nextInt();
        }
        System.out.println("猜中了");
    }

}
