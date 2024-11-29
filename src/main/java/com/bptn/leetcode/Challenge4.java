package com.bptn.leetcode;

import java.util.Scanner;

public class Challenge4 {

    // Method to find the missing number in the array
    public int findMissingNumber(int[] numbers) {
        int size = numbers.length;
        
        // Formula to calculate the sum of numbers from 0 to n
        int expectedTotal = (size * (size + 1)) / 2;
        
        // Calculate the sum of the numbers in the array
        int actualTotal = 0;
        for (int number : numbers) {
            actualTotal += number;
        }
        
        // The missing number is the difference between expected and actual sum
        return expectedTotal - actualTotal;
    }

    public static void main(String[] args) {
        // Initialize scanner for user input
        Scanner inputScanner = new Scanner(System.in);

        // Ask the user to provide the total number of elements
        System.out.print("How many numbers should be in the range? ");
        int totalNumbers = inputScanner.nextInt();
        
        // Create an array to store the user's numbers
        int[] userNumbers = new int[totalNumbers];
        
        // Prompt the user to enter the numbers in the array
        System.out.println("Please enter the numbers in the range [0, " + totalNumbers + "], separated by spaces (excluding one missing number):");
        for (int i = 0; i < totalNumbers; i++) {
            userNumbers[i] = inputScanner.nextInt();
        }

        // Instantiate the class to call the method
        Challenge4 numberFinder = new Challenge4();

        // Calculate and display the missing number
        int missing = numberFinder.findMissingNumber(userNumbers);
        System.out.println("The missing number is: " + missing);

        // Close the scanner to free up resources
        inputScanner.close();
    }
}

