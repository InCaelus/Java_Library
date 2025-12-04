import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class BookListTreeMapTest {

    @Test
    void addBook() {
        // given: 일부러 키(ISBN) 넣는 순서를 섞음
        TreeMap<String, ArrayList<Object>> map = new TreeMap<>();

        BookList.addBook(map, "900-11-003", "160.8 S817hKㅇ", "현대 경험주의와 분석철학", "스테그뮐러, 볼프강, 이초식, 김영남, 정영기", PhilosophyTraits.EMPIRICISM);
        BookList.addBook(map, "900-11-001", "166.1 F824dKㄱ", "데카르트의 『성찰』 입문", "김성호", PhilosophyTraits.RATIONALISM);
        BookList.addBook(map, "900-11-002", "166.1 이884ㄷ", "데카르트의 삶과 진리추구 : 방법서설", "이종훈", PhilosophyTraits.RATIONALISM);

        // when: TreeMap은 key 기준으로 정렬되며 keySet() 순회도 정렬 순서를 보장
        List<String> keys = new ArrayList<>(map.keySet());

        // then: ISBN 오름차순으로 출력/표출되는지 확인
        assertEquals(List.of("900-11-001", "900-11-002", "900-11-003"), keys);
    }
}
