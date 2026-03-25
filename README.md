# CS++ Java — Unit 6: Arrays

> **Unit 6** | 100 Points | 5 Autograded Tests

In this assignment you will declare, initialize, and traverse arrays using standard `for` loops and for-each loops. You will implement common array algorithms including summing, finding a maximum, reversing, checking sorted order, and counting occurrences.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [Methods to Implement](#methods-to-implement)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### Declaring and Initializing Arrays

```java
// Declare with initial values
int[] scores = {90, 85, 92, 88, 76};

// Declare with a specific size (all values start at 0)
int[] data = new int[10];

// Access elements by index (0-based)
scores[0]    // 90 (first element)
scores[4]    // 76 (last element)
scores.length // 5 (number of elements — no parentheses!)
```

### Traversing with a For Loop

```java
int[] arr = {10, 20, 30, 40, 50};

// Standard for loop (use when you need the index)
for (int i = 0; i < arr.length; i++) {
    System.out.println("Index " + i + ": " + arr[i]);
}

// For-each loop (use when you just need the values)
for (int value : arr) {
    System.out.println(value);
}
```

### Summing an Array

```java
int sum = 0;
for (int value : arr) {
    sum += value;
}
```

### Finding the Maximum

```java
int max = arr[0];  // start with the first element
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}
```

### Reversing an Array

Create a new array and fill it from back to front:

```java
int[] reversed = new int[arr.length];
for (int i = 0; i < arr.length; i++) {
    reversed[i] = arr[arr.length - 1 - i];
}
```

### Checking if an Array is Sorted

Compare each element to the next one:

```java
boolean sorted = true;
for (int i = 0; i < arr.length - 1; i++) {
    if (arr[i] > arr[i + 1]) {
        sorted = false;
        break;
    }
}
```

### Counting Occurrences

```java
int count = 0;
for (int value : arr) {
    if (value == target) {
        count++;
    }
}
```

---

## Project Overview

You will implement five static methods in `Unit6.java`. Each method works with `int[]` arrays and demonstrates a fundamental array algorithm.

---

## Methods to Implement

### 1. sumArray(int[] array)
Return the sum of all elements in the array.

```java
sumArray(new int[]{1, 2, 3, 4, 5})    // returns 15
sumArray(new int[]{10, -5, 3})         // returns 8
sumArray(new int[]{})                   // returns 0
```

### 2. maxElement(int[] array)
Return the largest element in the array.

```java
maxElement(new int[]{3, 7, 2, 9, 4})    // returns 9
maxElement(new int[]{-5, -1, -8})        // returns -1
maxElement(new int[]{42})                // returns 42
```

### 3. reverseArray(int[] array)
Return a new array with the elements in reverse order. Do not modify the original array.

```java
reverseArray(new int[]{1, 2, 3, 4, 5})   // returns {5, 4, 3, 2, 1}
reverseArray(new int[]{10, 20})           // returns {20, 10}
```

### 4. isSorted(int[] array)
Return `true` if the array is sorted in non-decreasing order (each element is less than or equal to the next).

```java
isSorted(new int[]{1, 2, 3, 4, 5})    // returns true
isSorted(new int[]{1, 1, 2, 3})       // returns true (equal elements are OK)
isSorted(new int[]{5, 3, 1})          // returns false
isSorted(new int[]{})                  // returns true
```

### 5. countOccurrences(int[] array, int number)
Return how many times `number` appears in the array.

```java
countOccurrences(new int[]{1, 2, 3, 2, 1}, 2)    // returns 2
countOccurrences(new int[]{5, 5, 5, 5}, 5)        // returns 4
countOccurrences(new int[]{1, 2, 3}, 9)            // returns 0
```

---

## File Structure

```
Unit-6-Tests/
├── pom.xml                                      <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/com/csplusplus/
│   │   └── Unit6.java                           <-- YOUR CODE GOES HERE
│   └── test/java/com/csplusplus/
│       └── Unit6Test.java                       <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                        <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit6.java`.**

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testSumArray | Sums all elements correctly | 20 |
| testMaxElement | Finds the largest element | 20 |
| testReverseArray | Returns reversed copy without modifying original | 15 |
| testIsSorted | Checks ascending order, handles equal elements | 15 |
| testCountOccurrences | Counts exact matches | 30 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — Array basics:**
```java
// Practice.java
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println("Length: " + nums.length);     // 5
        System.out.println("First: " + nums[0]);           // 10
        System.out.println("Last: " + nums[nums.length - 1]); // 50

        // Print the whole array
        System.out.println(Arrays.toString(nums));  // [10, 20, 30, 40, 50]
    }
}
```

**Example 2 — Sum and max:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        int[] nums = {4, 8, 15, 16, 23, 42};
        int sum = 0;
        int max = nums[0];

        for (int n : nums) {
            sum += n;
            if (n > max) max = n;
        }
        System.out.println("Sum: " + sum);  // 108
        System.out.println("Max: " + max);  // 42
    }
}
```

**Example 3 — Reverse and sorted check:**
```java
// Practice.java
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        System.out.println("Reversed: " + Arrays.toString(reversed));  // [5, 4, 3, 2, 1]

        // Check if sorted
        boolean sorted = true;
        for (int i = 0; i < original.length - 1; i++) {
            if (original[i] > original[i + 1]) {
                sorted = false;
                break;
            }
        }
        System.out.println("Is sorted: " + sorted);  // true
    }
}
```

---

## Tips for Success

1. Array `.length` has **no parentheses** (unlike `String.length()`)
2. Arrays are 0-indexed: the first element is `arr[0]`, the last is `arr[arr.length - 1]`
3. For `reverseArray`, create and return a **new** array — do not modify the original
4. For `isSorted`, an empty array and a single-element array are both considered sorted
5. For `maxElement`, initialize your max to `arr[0]`, not to `0` (because all elements could be negative)
6. Use `Arrays.toString(arr)` to print arrays for debugging

---

## FAQ

**Q: Why is `maxElement` initialized to `arr[0]` instead of `0`?**
If all elements are negative (like `{-5, -1, -8}`), initializing to `0` would incorrectly return `0`. Start with the first actual element.

**Q: Does `reverseArray` modify the original?**
No. You must create a new array and return it. The original array should remain unchanged.

**Q: What should `isSorted` return for duplicate elements like `{1, 1, 2, 3}`?**
`true`. The check is non-decreasing order (each element <= next), so equal adjacent elements are fine.

**Q: Can I use `Arrays.sort()` or other library methods?**
Only if the assignment allows it. For these methods, write the logic yourself using loops.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*
