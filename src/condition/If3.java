package condition;

public class If3 {

    public static void main(String[] args) {
        int a = 20;

        if (a <= 7) {
            System.out.println("미취학");
        }
        if (a >=8 && a<= 13) {
            System.out.println("초등학생");
        }
        if (a >= 14 && a<=16) {
            System.out.println("중학생");
        }
        if (a >= 17 && a<=19) {
            System.out.println("고등학생");
        }
        if (a > 20) {
            System.out.println("성인");
        }

    }
}
