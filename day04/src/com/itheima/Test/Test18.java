package com.itheima.Test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num = sc.nextInt();
        int inverseNum = 0;
        int num2 = num;
        while(num > 0){
            //从右往左获取每位数
            int ge = num%10;
            inverseNum = inverseNum*10 + ge;
            num = num/10;
        }
//        System.out.println(inverseNum);
        if (inverseNum==num2){
            System.out.println("你输入的数字"+num2+"是回文数");
        }
        else {
            System.out.println("你输入的数字"+num2+"不是回文数");
        }
    }
}
