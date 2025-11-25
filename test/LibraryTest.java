import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    private void setInput(String input) {
        ByteArrayInputStream in =
                new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        System.setIn(in);
    }

    @Test
    void userInput() {
        // 첫 입력: 없는 책 → 다시 입력 → 존재하는 책 입력
        setInput("없는 책\n데카르트의 『성찰』 입문\n");

        Library lib = new Library();
        lib.userInput();

        String output = outContent.toString();

        assertTrue(output.contains("존재하지 않는 책입니다"));
        assertTrue(output.contains("====책 정보===="));
        assertTrue(output.contains("제목: 데카르트의 『성찰』 입문"));
    }

    @Test
    void start() {
        // 메뉴 1회 실행 후 종료
        // 4 입력 → "프로그램 종료" 출력
        setInput("4\n");

        Library lib = new Library();
        lib.start();

        String output = outContent.toString();

        assertTrue(output.contains("철학 도서관 메뉴"));
        assertTrue(output.contains("프로그램 종료"));
    }
}
