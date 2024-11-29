package com.bptn.leetcode;

import java.util.Scanner;

public class Challenge3 {

	public int[] sortedSquares(int[] nums) {
		int n = nums.length; // Get the length of the input array
		int[] result = new int[n]; // Create an array to hold the squared values

		int left = 0; // Start pointer at the beginning of the array
		int right = n - 1; // End pointer at the end of the array
		int index = n - 1; // Index to insert the largest square in the result array, starting from the end

		// Loop until the two pointers meet
		while (left <= right) {
			// Calculate the squares of the current elements at both pointers
			int leftSquare = nums[left] * nums[left];
			int rightSquare = nums[right] * nums[right];

			// Compare the squares and insert the larger one into the result array
			if (leftSquare > rightSquare) {
				result[index] = leftSquare; // Place the larger square at the current index
				left++; // Move the left pointer to the right
			} else {
				result[index] = rightSquare; // Place the larger square at the current index
				right--; // Move the right pointer to the left
			}
			index--; // Move to the next position in the result array
		}

		return result; // Return the sorted array of squares
	}

	// Main method for testing
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Ask the user to input the size of the array
		System.out.print("Enter the number of elements: ");
		int n = scanner.nextInt();

		// Create an array of the specified size
		int[] nums = new int[n];
		System.out.println("Enter the elements of the array (separate the elements with a space):");

		// Populate the array with user input
		for (int i = 0; i < n; i++) {
			nums[i] = scanner.nextInt();
		}

		// Close the scanner
		scanner.close();

		// Create an instance of the Solution class and call the sortedSquares method
		Challenge3 solution = new Challenge3();
		int[] result = solution.sortedSquares(nums);

		// Print the result
		System.out.print("Result: ");
		for (int num : result) {
			System.out.print(num + " ");
		}

	}
}
