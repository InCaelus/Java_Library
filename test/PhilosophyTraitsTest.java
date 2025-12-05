import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhilosophyTraitsTest {

    @Test
    void valuesCount() {
        assertEquals(6, PhilosophyTraits.values().length);
    }

    @Test
    void toStringTest() {
        assertEquals("RATIONALISM", PhilosophyTraits.RATIONALISM.toString());
        assertEquals("EMPIRICISM", PhilosophyTraits.EMPIRICISM.toString());
    }
}
