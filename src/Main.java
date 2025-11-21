import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    System.out.println("도서관 프로그램 로딩중!");
    System.out.println("도서관 프로그램 로딩 완료 !");

    Library library = new Library();

    library.userInput();
    library.start();
    }
}