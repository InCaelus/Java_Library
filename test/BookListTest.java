import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookListTest {

    private BookList bookList;

    @BeforeEach
    void setUp() {
        bookList = new BookList();
    }

    @Test
    void getBookByTitle() {
        // 존재하는 책 테스트
        Book book = bookList.getBookByTitle("데카르트의 『성찰』 입문");
        assertNotNull(book);
        assertEquals("김성호", book.getAuthor());

        // 존재하지 않는 책 테스트
        Book notFound = bookList.getBookByTitle("없는 제목");
        assertNull(notFound);
    }

    @Test
    void getBooksByTrait() {
        // 특정 철학적 성향에 맞는 책 리스트 확인
        List<Book> rationalismBooks = bookList.getBooksByTrait(PhilosophyTraits.RATIONALISM);

        assertEquals(2, rationalismBooks.size());
        assertEquals("데카르트의 『성찰』 입문", rationalismBooks.get(0).getTitle());
    }

    @Test
    void getAllBooks() {
        // 전체 책 개수 확인 (기본 12권)
        List<Book> allBooks = bookList.getAllBooks();
        assertEquals(12, allBooks.size());
        assertFalse(allBooks.isEmpty());
    }
}
