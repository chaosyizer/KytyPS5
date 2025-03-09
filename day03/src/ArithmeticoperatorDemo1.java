public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("3 + 5 = " + (3 + 5));
        System.out.println("5 - 2 = " + (5 - 2));

        //在代码中如果有小数参加运算，计算的结果不一定精准
        //为什么？
        //暂时只了解有这个现象即可
        System.out.println("3.111 + 5.01 = " + (3.111 + 5.01));
        System.out.println("5.101 - 2.11 = " + (5.101 - 2.11));
        System.out.println("5.101 * 2.11 = " + (5.101 * 2.11));

        System.out.println("1.1 + 1.01 = " + (1.1 + 1.01));
        System.out.println("1.1 - 1.01 = " + (1.1 - 1.01));
        System.out.println("1.1 * 1.01 = " + (1.1 * 1.01));
    }
}