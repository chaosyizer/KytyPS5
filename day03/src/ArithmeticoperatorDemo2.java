public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {


        System.out.println(10 / 2);
        //单纯的整数参与计算只能得到整数
        System.out.println(10 / 3);


        //有小数参与的计算才能得到小数
        //以下两个计算得到的小数不精准
        System.out.println(10.0 / 3);
        System.out.println(10 / 3.0);


        //取模、取余
        System.out.println(10 % 2);
        System.out.println(10 % 3);

    }
}
