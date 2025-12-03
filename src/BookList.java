import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.Set;

public class BookList {

    private TreeMap<String, ArrayList<Object>> bookMap;

    public BookList() {
        bookMap = new TreeMap<>();
        loadDefaultBooks();
    }

    private void loadDefaultBooks() {
        addBook(bookMap, "900-11-002", "166.1 이884ㄷ",
                "데카르트의 삶과 진리추구 : 방법서설", "이종훈",
                PhilosophyTraits.RATIONALISM);

        addBook(bookMap, "900-11-003", "160.8 S817hKㅇ",
                "현대 경험주의와 분석철학",
                "스테그뮐러, 볼프강, 이초식, 김영남, 정영기",
                PhilosophyTraits.EMPIRICISM);

        addBook(bookMap, "900-11-001", "166.1 F824dKㄱ",
                "데카르트의 『성찰』 입문", "김성호",
                PhilosophyTraits.RATIONALISM);

        addBook(bookMap, "900-11-006", "165.21 A241kKㅂ",
                "칸트의『순수이성비판』",
                "박중목, 원당희",
                PhilosophyTraits.IDEALISM);

        addBook(bookMap, "900-11-005", "165.4 M322rK4ㄱ",
                "이성과 혁명",
                "김현일",
                PhilosophyTraits.IDEALISM);

        addBook(bookMap, "900-11-004", "135 D348eKㅎ",
                "경험주의와 주체성",
                "Deleuze, Gilles, 한정헌, 정유경",
                PhilosophyTraits.EMPIRICISM);

        addBook(bookMap, "900-11-008", "134 N935eKㄱ",
                "실존과 혁명",
                "김영숙",
                PhilosophyTraits.EXISTENTIALISM);

        addBook(bookMap, "900-11-010", "165.47 S374pKㅅ",
                "쇼펜하우어 인생론",
                "사순옥",
                PhilosophyTraits.PESSIMISM);

        addBook(bookMap, "900-11-007", "166.85 박482ㅅ",
                "사르트르의 실존주의",
                "박정자",
                PhilosophyTraits.EXISTENTIALISM);


        addBook(bookMap, "900-11-009", "165.47 S374dKㄱ",
                "당신은 인생이 왜 힘들지 않아야 한다고 생각하십니까",
                "김욱",
                PhilosophyTraits.PESSIMISM);

        addBook(bookMap, "900-11-011", "165.77 N677mKㅇ-2",
                "위버멘쉬",
                "어나니머스",
                PhilosophyTraits.NIHILISM);

        addBook(bookMap, "900-11-012", "165.77 장186ㅁ",
                "마흔에 읽는 니체 : 지금 이 순간을 살기 위한 철학 수업",
                "장재형",
                PhilosophyTraits.NIHILISM);
    }

    public static void addBook(TreeMap<String, ArrayList<Object>> map,
            String isbn,
            String callNumber,
            String title,
            String author,
            PhilosophyTraits trait) {

        ArrayList<Object> list = new ArrayList<>();

        list.add(callNumber); // index 0 : 청구기호
        list.add(title);      // index 1 : 제목
        list.add(author);     // index 2 : 저자
        list.add(trait);      // index 3 : 사상

        map.put(isbn, list);
    }
    public Book getBookByTitle(String title) {

        for (String isbn : bookMap.keySet()) {
            ArrayList<Object> info = bookMap.get(isbn);

            String callNumber = (String) info.get(0);
            String t = (String) info.get(1);
            String author = (String) info.get(2);
            PhilosophyTraits trait = (PhilosophyTraits) info.get(3);

            if (t.equalsIgnoreCase(title)) {
                return new Book(isbn, callNumber, title, author, trait);
            }
        }
        return null;
    }

    public List<Book> getBooksByTrait(PhilosophyTraits trait) {
        List<Book> list = new ArrayList<>();

        for (String isbn : bookMap.keySet()) {
            ArrayList<Object> info = bookMap.get(isbn);

            PhilosophyTraits tr = (PhilosophyTraits) info.get(3);

            if (tr == trait) {
                String callNumber = (String) info.get(0);
                String title = (String) info.get(1);
                String author =  (String) info.get(2);

                list.add(new Book(isbn, callNumber, title, author, trait));
            }
        }
        return list;
    }

    public List<Book> getAllBooks() {
        List<Book> list = new ArrayList<>();

        for (String isbn : bookMap.keySet()) {
            ArrayList<Object> info = bookMap.get(isbn);

            String callNumber = (String) info.get(0);
            String title = (String) info.get(1);
            String author = (String) info.get(2);
            PhilosophyTraits trait = (PhilosophyTraits) info.get(3);

            list.add(new Book(isbn, callNumber, title, author, trait));
        }
        return list;
    }
    
    //csv TreeMap 호출용
    public TreeMap<String, ArrayList<Object>> getbookMap() {
        return bookMap;
    }



}

