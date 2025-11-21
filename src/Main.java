import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = -1;


        while (choice != 0) {
            System.out.println("===== 메뉴 =====");
            System.out.println("1. 합리주의");
            System.out.println("2. 경험주의");
            System.out.println("3. 관념론");
            System.out.println("4. 비관주의");
            System.out.println("5. 실존주의");
            System.out.println("6. 니힐리즘");

            System.out.printf("원하시는 장르의 번호를 입력하시오: ");


            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:

                    System.out.println("합리주의 책 목록");
                    System.out.println("책1");
                    System.out.println("책2");
                    System.out.println("책3");
                    sc.nextLine();

                    break;

                case 2:
                    System.out.print("첫 번째 숫자: ");
                    int a = sc.nextInt();
                    System.out.print("두 번째 숫자: ");
                    int b = sc.nextInt();
                    System.out.println("결과: " + (a + b));
                    break;

                case 0:
                    System.out.println("프로그램 종료!");
                    break;

                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }



            System.out.println();
        }

        sc.close();
    }
}

