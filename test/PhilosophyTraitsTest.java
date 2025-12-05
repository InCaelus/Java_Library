import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PhilosophyTraitsTest {

    @Test
    void testToString() {

        String result = PhilosophyTraits.RATIONALISM.toString();
        assertEquals("RATIONALISM", result);

        /*
        String result2 = PhilosophyTraits.EMPIRICISM.toString();
        assertEquals("RATIONALISM", result2);
         */
    }

    @Test
    void valuesTest() {

        PhilosophyTraits[] arr = PhilosophyTraits.values();

        assertTrue(arr[0] == PhilosophyTraits.RATIONALISM);
        // assertTrue(arr[1] == PhilosophyTraits.RATIONALISM);
    }
}
