package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("한 개의 정수를 입력하세요(0을 누르면 종료): ");
            int num = scanner.nextInt();

            if (num == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            sum += num;
        }

        System.out.println("총 합계: " + sum);
    }
}
