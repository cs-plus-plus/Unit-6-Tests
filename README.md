# Unit 6 - Understanding Arrays in Java

## Overview
In this unit, students will learn about using arrays in Java, a fundamental concept for storing and manipulating collections of data. The focus will be on declaring arrays, accessing elements, traversing arrays with loops, and handling common array-related operations. This unit will help students understand how to work with sequential data structures, manage memory efficiently, and avoid common pitfalls associated with arrays.

## Learning Objectives
- Understand how to declare and initialize arrays in Java.
- Access array elements using index values.
- Traverse arrays using standard `for` loops and `for-each` loops.
- Understand and implement array operations such as reversing arrays, summing elements, and finding the maximum value.
- Handle edge cases such as empty arrays and array bounds.
  
## Key Concepts
- **Array**: A fixed-size data structure that stores multiple elements of the same type.
- **Array Declaration**: Defines an array’s type and name. Example: `int[] scores;`
- **Array Initialization**: Defines the size or values of an array. Example: `scores = new int[5];` or `int[] scores = {99, 88, 77};`
- **Array Length**: A field that stores the number of elements an array can hold. Access it using `array.length`.
- **Element Access**: Retrieve or update an element in an array using its index. Example: `scores[0] = 100;`
- **For-each Loop**: A loop that simplifies traversing arrays. Example: `for (int score : scores) {...}`
- **Out of Bounds Exception**: Error encountered when trying to access an invalid index (e.g., `arr[arr.length]`).

## Common Mistakes
- Declaring an array without creating it (e.g., `int[] nums;` but forgetting `nums = new int[5];`).
- Starting the array index at `1` instead of `0`.
- Using `array.length` as the last index instead of `array.length - 1`.
- Confusing `array.length()` with `array.length`.
- Going out of bounds when looping through an array (e.g., using `<= array.length` instead of `< array.length`).
- Exiting a loop prematurely, leading to incomplete processing of array elements.

## Assignment
Students are required to complete the `Unit6.java` class by implementing all the necessary methods related to arrays. They will demonstrate their understanding by ensuring that all provided JUnit tests in `Unit6Test.java` pass successfully.

## JUnit Tests Description and Points

1. **Test Sum of Array (20 points)**  
   Verifies that the method correctly calculates the sum of all elements in an array.

2. **Test Maximum Element (20 points)**  
   Ensures the method finds the maximum element in an array and handles edge cases such as empty arrays.

3. **Test Reverse Array (15 points)**  
   Confirms that the method returns a new array with the elements in reverse order.

4. **Test Array Sorting Check (15 points)**  
   Verifies that the method correctly identifies whether an array is sorted in ascending order.

5. **Test Element Occurrences (30 points)**  
   Ensures that the method accurately counts how many times a given element appears in an array.

## Getting Started
1. Clone the repository containing the Unit 6 project.
2. Open the project in your preferred IDE (such as IntelliJ IDEA or Eclipse).
3. Navigate to `Unit6.java` and implement the required methods and attributes.
4. Run the JUnit tests in `Unit6Test.java` to verify your implementations.
5. Ensure all tests pass before submitting your code.

## Submission
Submit your completed `Unit6.java` file through the course's designated submission platform by the due date. Ensure that all tests pass and your code adheres to the style guidelines provided in class.

## Resources
- [Java Documentation](https://docs.oracle.com/javase/8/docs/api/)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Java Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

## Support
If you encounter any issues or have questions about the assignment, please reach out during office hours or post in the course discussion forum.

For additional assistance, contact: **Kevin** at [kevin@csplusplus.com](mailto:kevin@csplusplus.com).

---

**Unit 6 - Understanding Arrays in Java** is part of the AP Computer Science A course, aimed at building a strong foundation in data structures and array manipulation.
