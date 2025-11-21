public class Book {
    private String title;
    private String author;
    private PhilosophyTraits trait;// 철학 사상
    private String callNumber; // 청구기호

    public Book(String title, String author, PhilosophyTraits trait, String callNumber) {
        this.title = title;
        this.author = author;
        this.trait = trait;
        this.callNumber = callNumber;
    }

    public String getTitle() {
        return title;
    }

    public PhilosophyTraits getTrait() {
        return trait;
    }

    public String getCallNumber() {
        return callNumber;
    }

    @Override
    public String toString() {
        return "------책 정보------"+ "\n제목: " + title + "\n사상: " + trait + "\n청구 기호: " + callNumber + "\n--------------";
    }
}
