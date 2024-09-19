package com.csplusplus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Unit6Test {

    // 1. Test for sumArray (20 points)
    @Test
    public void testSumArray() {
        assertEquals(15, Unit6.sumArray(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0, Unit6.sumArray(new int[]{0, 0, 0, 0, 0}));
        assertEquals(-15, Unit6.sumArray(new int[]{-1, -2, -3, -4, -5}));
    }

    // 2. Test for maxElement (20 points)
    @Test
    public void testMaxElement() {
        assertEquals(5, Unit6.maxElement(new int[]{1, 2, 3, 4, 5}));
        assertEquals(-1, Unit6.maxElement(new int[]{-5, -4, -3, -2, -1}));
    }

    // 3. Test for reverseArray (15 points)
    @Test
    public void testReverseArray() {
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, Unit6.reverseArray(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{}, Unit6.reverseArray(new int[]{}));
    }

    // 4. Test for isSorted (15 points)
    @Test
    public void testIsSorted() {
        assertTrue(Unit6.isSorted(new int[]{1, 2, 3, 4, 5}));
        assertFalse(Unit6.isSorted(new int[]{5, 4, 3, 2, 1}));
        assertTrue(Unit6.isSorted(new int[]{})); // Edge case: empty array
    }

    // 5. Test for countOccurrences (30 points)
    @Test
    public void testCountOccurrences() {
        assertEquals(3, Unit6.countOccurrences(new int[]{1, 2, 3, 1, 4, 1}, 1));  
        assertEquals(0, Unit6.countOccurrences(new int[]{1, 2, 3, 4, 5}, 6)); 
        assertEquals(4, Unit6.countOccurrences(new int[]{0, 0, 0, 0}, 0));
    }

}
