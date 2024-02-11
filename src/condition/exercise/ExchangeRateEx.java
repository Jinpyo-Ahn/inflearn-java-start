package condition.exercise;

public class ExchangeRateEx {

    public static void main(String[] args) {
        int dollar = 13;
        int won = 1300;
        int DollarToWon = 0;

        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            DollarToWon = dollar * won;
            System.out.println("환전 금액은 " + DollarToWon + "원입니다.");
        }
    }
}
