import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private String run(String input) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        PrintStream oldOut = System.out;
        java.io.InputStream oldIn = System.in;

        System.setOut(new PrintStream(out, true, "UTF-8"));
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));

        Library library = new Library();
        library.start();

        System.setOut(oldOut);
        System.setIn(oldIn);

        return out.toString("UTF-8");
    }

    @Test
    void start() throws Exception {
        String output = run("4\n");

        assertEquals(true, output.contains("===== 철학 도서관 메뉴 ====="));
        assertEquals(true, output.contains("프로그램 종료"));
    }

    @Test
    void showTraitMenu() throws Exception {
        String output = run("1\n999\n4\n");

        assertEquals(true, output.contains("--- 철학 사상 목록 ---"));
        assertEquals(true, output.contains("잘못된 번호입니다."));
    }

    @Test
    void showBookByMenu() throws Exception {
        String output = run("1\n1\n4\n");

        assertEquals(true, output.contains("사상의 책(isbn 정렬 완료)"));
        assertEquals(true, output.contains("------책 정보------"));
    }

    @Test
    void showBookByTrait() throws Exception {
        String output = run("1\n1\n4\n");

        int p1 = output.indexOf("isbn: 900-11-001");
        int p2 = output.indexOf("isbn: 900-11-002");

        assertEquals(true, p1 != -1);
        assertEquals(true, p2 != -1);
        assertEquals(true, p1 < p2);
    }

    @Test
    void searchBook() throws Exception {
        String output = run("2\n" + "데카르트의 삶과 진리추구 : 방법서설\n" + "4\n");

        assertEquals(true, output.contains("isbn: 900-11-002"));
        assertEquals(true, output.contains("저자: 이종훈"));
    }

    @Test
    void showAllBooks() throws Exception {
        String output = run("3\n4\n");

        assertEquals(true, output.contains("=== 전체 책 목록(isbn 정렬 완료) ==="));
        assertEquals(true, output.contains("isbn: 900-11-001"));
    }
}
