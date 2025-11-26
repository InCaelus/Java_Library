import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhilosophyTraitsTest {

    @Test
    void testToString() {
        assertEquals("RATIONALISM", PhilosophyTraits.RATIONALISM.toString());
        assertEquals("EMPIRICISM", PhilosophyTraits.EMPIRICISM.toString());
        assertEquals("IDEALISM", PhilosophyTraits.IDEALISM.toString());
        assertEquals("EXISTENTIALISM", PhilosophyTraits.EXISTENTIALISM.toString());
        assertEquals("PESSIMISM", PhilosophyTraits.PESSIMISM.toString());
        assertEquals("NIHILISM", PhilosophyTraits.NIHILISM.toString());
    }

    @Test
    void values() {
        PhilosophyTraits[] arr = PhilosophyTraits.values();

        // 개수 확인
        assertEquals(6, arr.length);

        // 값 포함 여부 확인
        assertTrue(arr[0] == PhilosophyTraits.RATIONALISM);
        assertTrue(arr[1] == PhilosophyTraits.EMPIRICISM);
        assertTrue(arr[2] == PhilosophyTraits.IDEALISM);
        assertTrue(arr[3] == PhilosophyTraits.EXISTENTIALISM);
        assertTrue(arr[4] == PhilosophyTraits.PESSIMISM);
        assertTrue(arr[5] == PhilosophyTraits.NIHILISM);
    }
}
