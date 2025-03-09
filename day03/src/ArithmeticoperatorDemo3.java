public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;

        int result = b1 + b2;
        System.out.println(result);

        byte result2 = (byte) (b1 + b2);//数据过大，强制转换超出了byte的范围，导致了出错
        System.out.println(result2);
    }
}
