import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("请输入两个整数");
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个整数");
        int num1 = sc.nextInt();

        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();

        System.out.println(num1 == 6 || num2 == 6 || ((num1+num2)%6)==0);

    }
}
