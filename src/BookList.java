import java.util.ArrayList;
import java.util.List;

public class BookList {

    private List<Book> books;

    public BookList() {
        books = new ArrayList<>();
        loadDefaultBooks();
    }
    private void loadDefaultBooks() {
        books.add(new Book("데카르트의 『성찰』 입문", "김성호",
                PhilosophyTraits.RATIONALISM, "166.1 F824dKㄱ"));
        books.add(new Book("데카르트의 삶과 진리추구 : 방법서설", "이종훈",
                PhilosophyTraits.RATIONALISM, "166.1 이884ㄷ"));

        books.add(new Book("현대 경험주의와 분석철학", "스테그뮐러, 볼프강, 이초식, 김영남, 정영기",
                PhilosophyTraits.EMPIRICISM, "160.8 S817hKㅇ"));
        books.add(new Book("경험주의와 주체성 : 흄에 따른 인간본성에 관한 시론", "Deleuze, Gilles, 한정헌, 정유경",
                PhilosophyTraits.EMPIRICISM, "135 D348eKㅎ"));

        books.add(new Book("이성과 혁명", "김현일",
                PhilosophyTraits.IDEALISM, "165.4 M322rK4ㄱ"));
        books.add(new Book("칸트의『순수이성비판』","박중목, 원당희",
                PhilosophyTraits.IDEALISM, "165.21 A241kKㅂ"));

        books.add(new Book("사르트르의 실존주의", "박정자",
                PhilosophyTraits.EXISTENTIALISM, "166.85 박482ㅅ"));
        books.add(new Book("실존과 혁명: 실존주의와 맑스주의의 휴머니즘논쟁사", "김영숙",
                PhilosophyTraits.EXISTENTIALISM, "134 N935eKㄱ"));

        books.add(new Book("당신은 인생이 왜 힘들지 않아야 한다고 생각하십니까", "김욱",
                PhilosophyTraits.PESSIMISM, "165.47 S374dKㄱ"));
        books.add(new Book("쇼펜하우어 인생론", "사순옥",
                PhilosophyTraits.PESSIMISM, "165.47 S374pKㅅ"));

        books.add(new Book("위버멘쉬", "어나니머스",
                PhilosophyTraits.NIHILISM, "165.77 N677mKㅇ-2"));
        books.add(new Book("마흔에 읽는 니체 : 지금 이 순간을 살기 위한 철학 수업", "장재형",
                PhilosophyTraits.NIHILISM, "165.77 장186ㅁ"));
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
    public List<Book> getBooksByTrait(PhilosophyTraits trait) {
        List<Book> list = new ArrayList<>();
        for (Book b : books) {
            if (b.getTrait() == trait) {
                list.add(b);
            }
        }
        return list;
    }

    public List<Book> getAllBooks() {
        return books;
    }
}
