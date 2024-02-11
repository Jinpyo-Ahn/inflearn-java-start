package operator;

public class Comp1 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 결과를 boolean 변수에 담는다.
        boolean result = a == b;
        System.out.println(result);
    }
}
