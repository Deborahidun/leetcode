package com.bptn.leetcode.challenge_2;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length; // Get the size of the array
        int[] result = new int[n]; // Array to store the sorted squares
        int left = 0; // Start pointer at the beginning of the array
        int right = n - 1; // End pointer at the end of the array
        int index = n - 1; // Position to place the largest square in result array

        // Use two pointers to fill the result array
        while (left <= right) {
            int leftValue = nums[left];
            int rightValue = nums[right];

            // Compare the squares of the two pointers
            if (leftValue * leftValue > rightValue * rightValue) {
                result[index] = leftValue * leftValue; // Put the larger square at the current position
                left++; // Move the left pointer forward
            } else {
                result[index] = rightValue * rightValue; // Put the larger square at the current position
                right--; // Move the right pointer backward
            }
            index--; // Move to the next position in the result array
        }

        return result; // Return the final sorted squares array
    }
}