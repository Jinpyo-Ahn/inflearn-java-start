package condition;

public class If6 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("천원이 할인되었습니다.");
        } else if (age <= 10) {
            discount = discount +1000;
            System.out.println("천원이 할인되었습니다.");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액은 " + discount + "원입니다.");
    }
}
