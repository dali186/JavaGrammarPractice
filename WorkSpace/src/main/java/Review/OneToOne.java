package Review;

import java.util.Scanner;

public class OneToOne {

    public static void main(String[] args) {
//
//        int answer = 0;
//
//        for (int a = 1; a <= 100; a++) {
//            for (int b = a + 1; b <= 100; b++) {
//                for (int c = b + 1; c <= 100; c++) {
//                    if (a + b > c && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
//                        answer++;
//                        //System.out.println(a + "," + b + "," + c);
//                    }
//                }
//            }
//        }
//        System.out.println(answer + "개의 쌍");
//    }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if(i + j >= 4) System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);

        System.out.println("얼마 가지고 있니?");
        int totalMoney = sc.nextInt();
        final int minPrice = 2500;
        if(totalMoney < minPrice) {
            System.out.println("입장 불가");
        }

        while (true) {
            printMenu();
            int choice = sc.nextInt();
            if(choice < 1 || choice > 5) {
                System.out.println("메뉴 선택 오류. 1~5 번 사이의 메뉴를 입력");
            }
        }

    }
    public static void printMenu() {
        System.out.println("""
                메뉴를 선택해주세요.
                ==================
                1. 김밥  (2500)
                2. 라면  (3000)
                3. 떡볶이 (4000)
                4. 돈까스 (5000)
                5. 종료
                ==================
                """);
    }
}
