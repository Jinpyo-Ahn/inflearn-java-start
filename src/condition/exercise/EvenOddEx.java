package condition.exercise;

public class EvenOddEx {

    public static void main(String[] args) {
        int num = 10;

        String result = (num % 2 == 0) ? "짝수" : "홀수";

        System.out.println("num = " + num + ", " + result);
    }
}
