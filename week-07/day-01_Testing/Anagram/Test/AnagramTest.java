import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void testAnagramFunctionWithEmptyStrings() {
        Anagram myAnagram = new Anagram();
        assertEquals(true, myAnagram.anagramFunction("",""));
    }

    @Test
    public void testAnagramFunctionWithAnagram() {
        Anagram myAnagram = new Anagram();
        assertEquals(true, myAnagram.anagramFunction("aba aba","aba aba"));
    }

    @Test
    public void testAnagramFunctionWithNonAnagram() {
        Anagram myAnagram = new Anagram();
        assertEquals(false, myAnagram.anagramFunction("baaba","caaba"));
    }

    @Test
    public void testAnagramFunctionWithUpperCase() {
        Anagram myAnagram = new Anagram();
        assertEquals(true, myAnagram.anagramFunction("Aaba","abaA"));
    }
}