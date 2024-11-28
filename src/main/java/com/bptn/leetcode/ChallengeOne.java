package com.bptn.leetcode;

import java.util.Scanner;

public class ChallengeOne {

	// Function to calculate the average salary
	public static double averageSalary(int[] salary) {
		// Ensure there are at least 3 salaries
		if (salary.length < 3) {
			throw new IllegalArgumentException("Array must contain at least 3 salaries.");
		}

		// Initialize min, max, and total salary
		int minimumSalary = Integer.MAX_VALUE;
		int maximumSalary = Integer.MIN_VALUE;
		int totalSalary = 0;

		// Loop to find min, max, and calculate total salary
		for (int s : salary) {
			minimumSalary = Math.min(minimumSalary, s);
			maximumSalary = Math.max(maximumSalary, s);
			totalSalary += s;
		}

		// Calculate average excluding min and max
		return (double) (totalSalary - minimumSalary - maximumSalary) / (salary.length - 2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input the number of salaries
		System.out.print("Enter the number of salaries: ");
		int n = scanner.nextInt();

		// Validate input
		if (n < 3) {
			System.out.println("There must be at least 3 salaries.");
			return;
		}

		// Input the salaries
		int[] salary = new int[n];
		System.out.println("Enter the salaries:");
		for (int i = 0; i < n; i++) {
			salary[i] = scanner.nextInt();
		}

		// Calculate and print the average salary
		double average = averageSalary(salary);
		System.out.printf("The average salary excluding the minimum and maximum is: %.5f%n", average);

		scanner.close();
	}
}
