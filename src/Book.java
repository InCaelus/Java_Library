public class Book {
    private String title;
    private String trait; // 성향
    private String callNumber; // 청구기호

    public Book(String title, String trait, String callNumber) {
        this.title = title;
        this.trait = trait;
        this.callNumber = callNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getTrait() {
        return trait;
    }

    public String getCallNumber() {
        return callNumber;
    }
}
