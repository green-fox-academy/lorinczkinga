import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void testOfGetListOfNumbers() {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2,2,2));
        Sum mySum = new Sum(myList);
        assertEquals(new ArrayList<>(Arrays.asList(2,2,2)), mySum.getListOfNumbers());
    }

    @Test
    public void TestOfSummarizeWithEmptyList() {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList());
        Sum mySum = new Sum(myList);
        assertEquals(0, mySum.summarize());
    }

    @Test
    public void TestOfSummarizeWithOneElementList() {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2));
        Sum mySum = new Sum(myList);
        assertEquals(2, mySum.summarize());
    }

    @Test
    public void TestOfSummarizeWithMultipleElementList() {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(2,2,2));
        Sum mySum = new Sum(myList);
        assertEquals(6, mySum.summarize());
    }

    @Test
    public void TestOfSummarizeWithNull() {
        Sum mySum = new Sum();
        assertEquals(0, mySum.summarize());
    }
}