import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        String isbn = "900-11-002";
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", null);
        String result = book.getIsbn();
        assertEquals(isbn, result);
    }

    @Test
    void getCallNumber() {
        String callNumber = "166.1 이884ㄷ";
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", null);

        String result = book.getCallNumber();
        assertEquals(callNumber, result);
    }

    @Test
    void getTitle() {
        String title = "데카르트의 삶과 진리추구 : 방법서설";
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", null);
        String result = book.getTitle();
        assertEquals(title, result);
    }

    @Test
    void getAuthor() {
        String author = "이종훈";
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", null);
        String result = book.getAuthor();
        assertEquals(author, result);
    }

    @Test
    void getTrait() {
        PhilosophyTraits trait = PhilosophyTraits.RATIONALISM;
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", trait);
        assertEquals(trait, book.getTrait());
    }


}
