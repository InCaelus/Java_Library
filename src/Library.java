import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    public void addBook(String title, String author, String trait, String callNumber) {
        books.add(new Book(title, author, trait, callNumber));
    }

    public void printBooks() {
        for (Book b : books) {
            System.out.println("책 제목: " + b.getTitle()
                    + ", 철학 분류: " + b.getTrait()
                    + ", 청구번호: " + b.getCallNumber());
        }
    }

}
