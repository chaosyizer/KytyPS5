import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位的整数");
        int number = sc.nextInt();

        System.out.println("个位："+(number%10));
        System.out.println("十位："+(number/10%10));
        System.out.println("百位："+(number/100%10));

    }
}
