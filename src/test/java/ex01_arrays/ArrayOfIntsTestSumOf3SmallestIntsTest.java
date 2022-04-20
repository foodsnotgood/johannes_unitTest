package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsTestSumOf3SmallestIntsTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

    @Test
    void normalTest() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1,2,3,4});
        assertEquals(6 ,result);
    }

    @Test
    void emptyArray() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{});
        assertEquals(0, result);
    }

    @Test
    void nullArray() {
        int result = arrayOfInts.sumOf3SmallestInts(null);
        assertEquals(0, result);
    }

    @Test
    void arrayWithNegNums() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{-1,-3,4,6});
        assertEquals(0, result);
    }

    @Test
    void smallArray() {
        int result = arrayOfInts.sumOf3SmallestInts(new int[]{1,2});
        assertEquals(3, result);
    }
}