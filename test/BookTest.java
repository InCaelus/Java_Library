import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getIsbn() {
        // given
        String isbn = "900-11-002";
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", null);

        // when
        String result = book.getIsbn();

        // then
        assertEquals(isbn, result);
    }

    @Test
    void getCallNumber() {
        // given
        String callNumber = "166.1 이884ㄷ";
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", null);

        // when
        String result = book.getCallNumber();

        // then
        assertEquals(callNumber, result);
    }

    @Test
    void getTitle() {
        // given
        String title = "데카르트의 삶과 진리추구 : 방법서설";
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", null);

        // when
        String result = book.getTitle();

        // then
        assertEquals(title, result);
    }

    @Test
    void getAuthor() {
        // given
        String author = "이종훈";
        Book book = new Book("900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈", null);

        // when
        String result = book.getAuthor();

        // then
        assertEquals(author, result);
    }

}
