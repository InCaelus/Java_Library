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
        Book book = bookList.getBookByTitle("데카르트의 『성찰』 입문");
        assertNotNull(book);
        assertEquals("김성호", book.getAuthor());

        Book notFound = bookList.getBookByTitle("없는 제목");
        assertNull(notFound);
    }

    @Test
    void getBooksByTrait() {
        List<Book> list = bookList.getBooksByTrait(PhilosophyTraits.RATIONALISM);
        assertEquals(2, list.size());
    }

    @Test
    void getAllBooks() {
        List<Book> allBooks = bookList.getAllBooks();
        assertEquals(12, allBooks.size());
        assertFalse(allBooks.isEmpty());
    }
}
