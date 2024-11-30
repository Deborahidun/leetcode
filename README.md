# leetcode

This repository contains solutions to several LeetCode problems implemented in Java using Eclipse. The main goal of these programs is to provide efficient solutions to common coding problems while explaining the approach in a simple and easy-to-understand way.

---

## Challenges and Solutions

### 1. Average Salary Excluding the Minimum and Maximum Salary

This program calculates the average salary from an array of salaries, excluding the minimum and maximum values.

- Input Validation: The solution ensures the array contains at least three salaries. If there are fewer than three salaries, an IllegalArgumentException is thrown.
- Finding Min, Max, and Total Salary: The program iterates through the salary array to calculate the total salary while simultaneously determining the minimum and maximum values.
- Average Calculation: After the iteration, the program computes the average by subtracting the minimum and maximum salaries from the total salary and dividing by the remaining number of salaries (array length minus 2).
- Efficiency: The time complexity is O(n), where n is the length of the salary array. The algorithm requires only one pass through the array, making it efficient. The space complexity is O(1), as only a constant amount of extra space is used.

### 2. *Squares of a Sorted Array*

This program computes the squares of elements from a sorted array and returns them in sorted order.

- *Two-Pointer Technique:* Uses two pointers, one at the start and one at the end, comparing squares of elements and placing the larger square at the correct position.
- *Efficiency:* Time complexity is O(n), as it avoids sorting the array again and works directly with the given order.
### 3. *Missing Number*

This program finds the missing number in an array of integers ranging from 0 to n, where one number is missing.

- *Mathematical Formula:* Uses the formula n * (n + 1) / 2 to find the expected total sum and compares it with the actual sum of the array.
- *Finding the Missing Number:* The missing number is the difference between the expected total and actual total.
- *Efficiency:* Time complexity is O(n), requiring just one pass through the array.

### 4. *Add Two Numbers*

This program adds two numbers represented as linked lists, where each node contains a digit in reverse order.

- *Process:* 
    - Traverse both lists, adding corresponding digits and the carry from the previous step.
    - If one list is shorter, treat missing digits as zero.
    - Update the carry and create a new node with the sum (mod 10).

- *Edge Cases:* Handles different list lengths and final carry.

- *Time Complexity:* *O(max(n, m))*  
- *Space Complexity:* *O(max(n, m))*

### 5. *Merge Two Sorted Lists*

This program merges two sorted linked lists into one sorted linked list.

* *Merging Process:* The solution uses a dummy node to simplify the merging process. It iterates through both input lists, comparing the current nodes of each list and appending the smaller node to the merged list. The program moves the pointer of the list from which the node was taken.
* *Handling Remaining Nodes:* Once one list is fully traversed, any remaining nodes from the other list are directly appended to the merged list.
* *Efficiency:* The time complexity is O(n + m), where n and m are the lengths of the two input lists. The algorithm makes a single pass through both lists, resulting in an optimal solution. The space complexity is O(1) as the solution only uses a constant amount o
