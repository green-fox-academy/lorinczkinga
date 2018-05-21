import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void countLetters() {
        CountLetters myTest = new CountLetters();
        HashMap expectedHashMap = new HashMap();
        expectedHashMap.put('e',2);
        expectedHashMap.put('x',1);
        expectedHashMap.put('a',1);
        expectedHashMap.put('m',1);
        expectedHashMap.put('p',4);
        expectedHashMap.put('l',1);

        assertTrue(expectedHashMap.equals(myTest.countLetters("exampppple")));
    }
}