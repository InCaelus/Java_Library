public class Book {
    private String isbn;
    private String title;
    private String author;
    private PhilosophyTraits trait;// 철학 사상
    private String callNumber; // 청구기호

    public Book(String isbn, String callNumber, String title, String author, PhilosophyTraits trait) {
        this.isbn = isbn;
        this.callNumber = callNumber;
        this.title = title;
        this.author = author;
        this.trait = trait;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public PhilosophyTraits getTrait() {
        return trait;
    }

    @Override
    public String toString() {
        return "------책 정보------" + "\nisbn: " + isbn + "\n청구 기호: " + callNumber + "\n제목: " + title + "\n저자: " + author  + "\n사상: " + trait +  "\n--------------";
    }
}
