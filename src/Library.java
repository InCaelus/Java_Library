import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
   private BookList bl;
   private Scanner sc;

   public Library() {
       sc = new Scanner(System.in);
       bl = new BookList();
   }

   public void userInput() {
       while(true) {
           System.out.println("책 제목을 입력하세요");
           String title = sc.nextLine();

           Book b = bl.getBookByTitle(title);

           if(b == null) {
               System.out.println("존재하지 않는 책입니다. 다시 입력하세요");
           } else {

               System.out.println("====책 정보====");
               System.out.println("제목: " + b.getTitle());
               System.out.println("사상: " + b.getTrait());
               System.out.println("청구 기호: " + b.getCallNumber());
               System.out.println("==============");
               break;
           }
       }
   }
    public void start() {
        while (true) {
            System.out.println("===== 철학 도서관 메뉴 =====");
            System.out.println("1. 사상별 책 보기");
            System.out.println("2. 책 검색");
            System.out.println("3. 모든 책 보기");
            System.out.println("4. 종료");
            System.out.print("번호 입력: ");

            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    showTraitMenu();
                    break;
                case "2":
                    searchBook();
                    break;
                case "3":
                    showAllBooks();
                    break;
                case "4":
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void showTraitMenu() {
        System.out.println("\n--- 철학 사상 목록 ---");
        int n = 1;
        for (PhilosophyTraits t : PhilosophyTraits.values()) {
            System.out.println(n++ + ". " + t);
        }

        System.out.print("번호 입력: ");
        int index = Integer.parseInt(sc.nextLine());

        if (index < 1 || index > PhilosophyTraits.values().length) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        PhilosophyTraits trait = PhilosophyTraits.values()[index - 1];
        showBooksByTrait(trait);
    }

    private void showBooksByTrait(PhilosophyTraits trait) {
        System.out.println("\n=== " + trait + " 사상의 책 ===");

        List<Book> books = bl.getBooksByTrait(trait);

        if (books.isEmpty()) {
            System.out.println("해당 사상의 책이 없습니다.");
            return;
        }

        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println();
    }

    private void searchBook() {
        System.out.print("검색할 책 제목 입력: ");
        String title = sc.nextLine();

        Book book = bl.getBookByTitle(title);

        if (book == null) {
            System.out.println("검색 결과 해당 책이 없습니다.\n");
        } else {
            System.out.println(book + "\n");
        }
    }

    private void showAllBooks() {
        System.out.println("\n=== 전체 책 목록 ===");
        for (Book b : bl.getAllBooks()) {
            System.out.println(b);
        }
        System.out.println();
    }
}