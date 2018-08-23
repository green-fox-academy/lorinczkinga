import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    private static Anagram myAnagram;

    @BeforeClass
    public static void init() {
        myAnagram = new Anagram();
    }

    @Test
    public void testAnagramFunctionWithEmptyStrings() {
        assertTrue(myAnagram.anagramFunction("", ""));
    }

    @Test
    public void testAnagramFunctionWithAnagram() {
        assertTrue(myAnagram.anagramFunction("aba aba", "aba aba"));
    }

    @Test
    public void testAnagramFunctionWithNonAnagram() {
        assertFalse(myAnagram.anagramFunction("baaba", "caaba"));
    }

    @Test
    public void testAnagramFunctionWithUpperCase() {
        assertTrue(myAnagram.anagramFunction("Aaba", "abaA"));
    }
}