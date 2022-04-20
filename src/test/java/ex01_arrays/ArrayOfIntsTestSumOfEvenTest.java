package ex01_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfIntsTestSumOfEvenTest {

    private final ArrayOfInts arrayOfInts = new ArrayOfInts();

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
    void addingEven() {
        int result = arrayOfInts.sumOfEven(new int[]{1,2,3,4,5,6});
        assertEquals(12, result);
    }

    @Test
    void onlyUneven() {
        int result = arrayOfInts.sumOfEven(new int[]{1,3,5,7});
        assertEquals(0, result);
    }

    @Test
    void onlyEven() {
        int result = arrayOfInts.sumOfEven(new int[]{2,4,6});
        assertEquals(12, result);
    }

    @Test
    void negativeUneven() {
        int result = arrayOfInts.sumOfEven(new int[]{-1,-3,-5});
        assertEquals(0, result);
    }

    @Test
    void negativeEven() {
        int result = arrayOfInts.sumOfEven(new int[]{-2,-4,-6});
        assertEquals(-12, result);
    }
}