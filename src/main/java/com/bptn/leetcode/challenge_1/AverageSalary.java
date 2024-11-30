package com.bptn.leetcode.challenge_1;

public class AverageSalary {

	// Function to calculate the average salary
	public double average(int[] salary) {
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
		// Instantiate the AverageSalary class
		AverageSalary averageSalary = new AverageSalary();

		// Example salary arrays
		int[] salary1 = { 4000, 3000, 1000, 2000 };
		int[] salary2 = { 1000, 2000, 3000 };
		averageSalary.average(salary1);
		averageSalary.average(salary2);
		
		System.out.println("Average Salary for salary1: " + averageSalary.average(salary1));
		System.out.println("Average Salary for salary2: " + averageSalary.average(salary2));
	}
}
