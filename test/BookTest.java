import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getTitle() {
        Book book = new Book(
                "데카르트의 『성찰』 입문",
                "김성호",
                PhilosophyTraits.RATIONALISM,
                "166.1 F824dKㄱ"
        );

        assertEquals("데카르트의 『성찰』 입문", book.getTitle());
    }

    @Test
    void getAuthor() {
        Book book = new Book(
                "데카르트의 『성찰』 입문",
                "김성호",
                PhilosophyTraits.RATIONALISM,
                "166.1 F824dKㄱ"
        );

        assertEquals("김성호", book.getAuthor());
    }

    @Test
    void getTrait() {
        Book book = new Book(
                "데카르트의 『성찰』 입문",
                "김성호",
                PhilosophyTraits.RATIONALISM,
                "166.1 F824dKㄱ"
        );

        assertEquals(PhilosophyTraits.RATIONALISM, book.getTrait());
    }

    @Test
    void getCallNumber() {
        Book book = new Book(
                "데카르트의 『성찰』 입문",
                "김성호",
                PhilosophyTraits.RATIONALISM,
                "166.1 F824dKㄱ"
        );

        assertEquals("166.1 F824dKㄱ", book.getCallNumber());
    }

    @Test
    void testToString() {
        Book book = new Book(
                "칸트의『순수이성비판』",
                "박중목, 원당희",
                PhilosophyTraits.IDEALISM,
                "165.21 A241kKㅂ"
        );

        String out = book.toString();

        assertTrue(out.contains("------책 정보------"));
        assertTrue(out.contains("제목: 칸트의『순수이성비판』"));
        assertTrue(out.contains("저자: 박중목, 원당희"));
        assertTrue(out.contains(PhilosophyTraits.IDEALISM.toString()));
        assertTrue(out.contains("청구 기호: 165.21 A241kKㅂ"));
        assertTrue(out.contains("--------------"));
    }
}
