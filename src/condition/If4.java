package condition;

public class If4 {

    public static void main(String[] args) {
        int a = 14;

        if (a <=7) {
            System.out.println("미취학");
        } else if (a <= 13) {
            System.out.println("초등학생");
        } else if (a <= 16) {
            System.out.println("중학생");
        } else if (a <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
