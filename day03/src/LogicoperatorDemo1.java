public class LogicoperatorDemo1 {
    public static void main(String[] args) {

        //短路逻辑运算符
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);


        System.out.println("");
        //与
        a = 10;
        b = 10;
        boolean result2 = ++a < 5 & ++b < 5;
        System.out.println(result2);
        System.out.println(a);
        System.out.println(b);
    }
}
