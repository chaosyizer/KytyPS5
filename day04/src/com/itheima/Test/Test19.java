package com.itheima.Test;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int bei = sc.nextInt();
        System.out.println("请输入除数");
        int chu = sc.nextInt();
        int chuTemp = chu;
        int count = 0;

        while(bei >= chu){
            count ++;
            chu = chu + chuTemp;
        }
        System.out.println("商 = "+count+"\n余数 ="+(bei+chuTemp-chu));
    }
}
