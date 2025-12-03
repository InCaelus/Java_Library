public class Book {
    private String isbn;
    private String title;
    private String author;
    private PhilosophyTraits trait;// 철학 사상
    private String callNumber; // 청구기호

    public Book(String isbn, String title, String author, PhilosophyTraits trait, String callNumber) {
        this.isbn = isbn;
        this.callNumber = callNumber;
        this.title = title;
        this.author = author;
        this.trait = trait;
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
        return "------책 정보------"+ "\n청구 기호: " + callNumber + "\n제목: " + title + "\n저자: " + author  + "\n철학 사상: " + trait + "\n--------------";
    }
}
