package com.csplusplus;

public class Unit6 {

    public static void main(String[] args) {
        // Test your methods here by calling them and printing the results
        // Example: test sumArray
        System.out.println("sumArray({1, 2, 3, 4, 5}) = " + sumArray(new int[]{1, 2, 3, 4, 5}));  // Expected: 15
    }

    /**
     * Calculates the sum of all elements in an integer array.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>sumArray({1, 2, 3, 4, 5}) returns 15</li>
     *   <li>sumArray({0, 0, 0}) returns 0</li>
     *   <li>sumArray({}) returns 0</li>
     * </ul>
     *
     * <p>Hint: Use a for-each loop to iterate through the array.
     * Start with a sum variable at 0 and add each element to it.</p>
     *
     * @param array the array of integers
     * @return the sum of all elements
     */
    public static int sumArray(int[] array) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Finds and returns the maximum element in an integer array.
     *
     * <p>Points: 20</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>maxElement({1, 2, 3, 4, 5}) returns 5</li>
     *   <li>maxElement({-5, -4, -3, -2, -1}) returns -1</li>
     * </ul>
     *
     * <p>Hint: Initialize your max variable to the first element (NOT to 0,
     * since all elements could be negative). Then loop through comparing each element.</p>
     *
     * @param array the array of integers (assumed non-empty)
     * @return the maximum element
     */
    public static int maxElement(int[] array) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Returns a new array with the elements in reverse order.
     * The original array should not be modified.
     *
     * <p>Points: 15</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>reverseArray({1, 2, 3, 4, 5}) returns {5, 4, 3, 2, 1}</li>
     *   <li>reverseArray({}) returns {}</li>
     * </ul>
     *
     * <p>Hint: Create a new array of the same length. Use a loop to fill the
     * new array starting from the end of the original array.</p>
     *
     * @param array the original array
     * @return a new array with elements in reverse order
     */
    public static int[] reverseArray(int[] array) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Checks whether the array is sorted in ascending order.
     * An empty array or single-element array is considered sorted.
     *
     * <p>Points: 15</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>isSorted({1, 2, 3, 4, 5}) returns true</li>
     *   <li>isSorted({5, 4, 3, 2, 1}) returns false</li>
     *   <li>isSorted({}) returns true</li>
     * </ul>
     *
     * <p>Hint: Loop through the array comparing each element to the next one.
     * If any element is greater than the next, return false. If you finish
     * the loop without finding a violation, return true.</p>
     *
     * @param array the array to check
     * @return true if the array is sorted in ascending order
     */
    public static boolean isSorted(int[] array) {
        // TODO: Implement this method
        return false;
    }

    /**
     * Counts how many times a given number appears in the array.
     *
     * <p>Points: 30</p>
     *
     * <p>Examples:</p>
     * <ul>
     *   <li>countOccurrences({1, 2, 3, 1, 4, 1}, 1) returns 3</li>
     *   <li>countOccurrences({1, 2, 3, 4, 5}, 6) returns 0</li>
     * </ul>
     *
     * <p>Hint: Use a for-each loop and a counter variable. For each element
     * that equals the target number, increment your counter.</p>
     *
     * @param array the array to search
     * @param number the number to count
     * @return the number of times the given number appears
     */
    public static int countOccurrences(int[] array, int number) {
        // TODO: Implement this method
        return 0;
    }
}
