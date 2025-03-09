public class TernaryoperatorDemo1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;


        //三元运算符
        //格式：   关系表达式 ? 表达式1 : 表达式2;
        //三元运算符的结果必须被使用
        System.out.println("num1 = " + num1 + "  " + "num2 = " + num2);
        int max = num1 > num2 ? num1 : num2;

        System.out.println("max ="+max);
        System.out.println("max ="+ (num1 > num2 ? num1 : num2));
    }
}
