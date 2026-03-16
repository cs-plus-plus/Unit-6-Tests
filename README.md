# Unit 6: Array

AP Computer Science A

## Overview

This project covers **Unit 6: Array** concepts including array declaration, initialization, traversal with standard and for-each loops, and common array algorithms. Implement the 5 methods in `Unit6.java` and run the provided JUnit tests to verify your work.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/com/csplusplus/Unit6.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Accept the assignment via the GitHub Classroom link
2. Clone the repository using GitHub Desktop
3. Open the project in your IDE (VS Code, IntelliJ, or Eclipse)
4. **Requirements:** Java 17+, Maven 3.x

## Running Tests

### In VS Code / Codespaces

Click the green play button next to any test method in `Unit6Test.java`, or open the **Testing** sidebar (beaker icon).

### Command Line

Run all tests:
```
mvn test
```

Run a single method's tests:
```
mvn -Dtest=Unit6Test#testSumArray test
```

## Scoring

| # | Method | Points | Concepts |
|---|--------|--------|----------|
| 1 | `sumArray(int[])` | 20 | For-each loop, accumulator |
| 2 | `maxElement(int[])` | 20 | Array traversal, tracking max |
| 3 | `reverseArray(int[])` | 15 | New array creation, index mapping |
| 4 | `isSorted(int[])` | 15 | Adjacent element comparison |
| 5 | `countOccurrences(int[], int)` | 30 | For-each loop, counting pattern |
| | **Total** | **100** | |

## Method Details

### 1. `sumArray(int[] array)` — 20 points
Returns the sum of all elements in the array.
- `sumArray({1, 2, 3, 4, 5})` → `15`
- `sumArray({})` → `0`

### 2. `maxElement(int[] array)` — 20 points
Returns the largest element in the array.
- `maxElement({1, 2, 3, 4, 5})` → `5`
- `maxElement({-5, -4, -3, -2, -1})` → `-1`

### 3. `reverseArray(int[] array)` — 15 points
Returns a new array with elements in reverse order.
- `reverseArray({1, 2, 3, 4, 5})` → `{5, 4, 3, 2, 1}`

### 4. `isSorted(int[] array)` — 15 points
Returns true if the array is in ascending order.
- `isSorted({1, 2, 3})` → `true`
- `isSorted({3, 1, 2})` → `false`

### 5. `countOccurrences(int[] array, int number)` — 30 points
Counts how many times a number appears in the array.
- `countOccurrences({1, 2, 1, 3, 1}, 1)` → `3`

## Common Mistakes

- Using `array.length()` instead of `array.length` (arrays use a field, not a method)
- Starting array index at 1 instead of 0
- Using `<= array.length` instead of `< array.length` in loop conditions (causes ArrayIndexOutOfBoundsException)
- Initializing max to 0 instead of the first element (fails with all-negative arrays)
- Modifying the original array in `reverseArray` instead of creating a new one
- Forgetting to handle empty arrays

## Autograding

Your code is automatically graded when you push to GitHub. Check the **Actions** tab to see your score. Each method is tested independently — you earn points for each method you complete correctly.

## Contact

For questions, contact [kevin@csplusplus.com](mailto:kevin@csplusplus.com)
