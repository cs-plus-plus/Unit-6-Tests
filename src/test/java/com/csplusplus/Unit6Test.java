package com.csplusplus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Unit6Test {

    // ── Method 1: sumArray (20 points) ──────────────────────────────────────

    @Test
    @DisplayName("sumArray: Sum of all elements in an array (20 points)")
    public void testSumArray() {
        assertAll("sumArray",
            () -> assertEquals(15, Unit6.sumArray(new int[]{1, 2, 3, 4, 5}),
                "sumArray({1, 2, 3, 4, 5}) should return 15"),
            () -> assertEquals(0, Unit6.sumArray(new int[]{0, 0, 0, 0, 0}),
                "sumArray({0, 0, 0, 0, 0}) should return 0 (all zeros)"),
            () -> assertEquals(-15, Unit6.sumArray(new int[]{-1, -2, -3, -4, -5}),
                "sumArray({-1, -2, -3, -4, -5}) should return -15 (negative numbers)")
        );
    }

    // ── Method 2: maxElement (20 points) ────────────────────────────────────

    @Test
    @DisplayName("maxElement: Find the maximum element in an array (20 points)")
    public void testMaxElement() {
        assertAll("maxElement",
            () -> assertEquals(5, Unit6.maxElement(new int[]{1, 2, 3, 4, 5}),
                "maxElement({1, 2, 3, 4, 5}) should return 5"),
            () -> assertEquals(-1, Unit6.maxElement(new int[]{-5, -4, -3, -2, -1}),
                "maxElement({-5, -4, -3, -2, -1}) should return -1 (largest negative). " +
                "Initialize max to the first element, NOT to 0!")
        );
    }

    // ── Method 3: reverseArray (15 points) ──────────────────────────────────

    @Test
    @DisplayName("reverseArray: Return a new array with elements reversed (15 points)")
    public void testReverseArray() {
        assertAll("reverseArray",
            () -> assertArrayEquals(new int[]{5, 4, 3, 2, 1},
                Unit6.reverseArray(new int[]{1, 2, 3, 4, 5}),
                "reverseArray({1, 2, 3, 4, 5}) should return {5, 4, 3, 2, 1}"),
            () -> assertArrayEquals(new int[]{},
                Unit6.reverseArray(new int[]{}),
                "reverseArray({}) should return {} (empty array stays empty)")
        );
    }

    // ── Method 4: isSorted (15 points) ──────────────────────────────────────

    @Test
    @DisplayName("isSorted: Check if array is sorted in ascending order (15 points)")
    public void testIsSorted() {
        assertAll("isSorted",
            () -> assertTrue(Unit6.isSorted(new int[]{1, 2, 3, 4, 5}),
                "isSorted({1, 2, 3, 4, 5}) should return true (ascending order)"),
            () -> assertFalse(Unit6.isSorted(new int[]{5, 4, 3, 2, 1}),
                "isSorted({5, 4, 3, 2, 1}) should return false (descending order)"),
            () -> assertTrue(Unit6.isSorted(new int[]{}),
                "isSorted({}) should return true (empty array is considered sorted)")
        );
    }

    // ── Method 5: countOccurrences (30 points) ──────────────────────────────

    @Test
    @DisplayName("countOccurrences: Count how many times a number appears (30 points)")
    public void testCountOccurrences() {
        assertAll("countOccurrences",
            () -> assertEquals(3, Unit6.countOccurrences(new int[]{1, 2, 3, 1, 4, 1}, 1),
                "countOccurrences({1, 2, 3, 1, 4, 1}, 1) should return 3"),
            () -> assertEquals(0, Unit6.countOccurrences(new int[]{1, 2, 3, 4, 5}, 6),
                "countOccurrences({1, 2, 3, 4, 5}, 6) should return 0 (not found)"),
            () -> assertEquals(4, Unit6.countOccurrences(new int[]{0, 0, 0, 0}, 0),
                "countOccurrences({0, 0, 0, 0}, 0) should return 4 (all elements match)")
        );
    }
}
