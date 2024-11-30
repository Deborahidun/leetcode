package com.bptn.leetcode.challenge_3;


public class MissingNumbers {

    // Method to find the missing number in the array
	  public int missingNumber(int[] nums) {

	        int n = nums.length;
	        
	        // Calculate the expected sum of numbers from 0 to n
	        int expectedSum = (n * (n + 1)) / 2;
	        
	        // Calculate the sum of elements in the array
	        int actualSum = 0;
	        for (int i = 0; i < n; i++) {
	            actualSum += nums[i];
	        }

	        // Return the difference (missing number)
	        return expectedSum - actualSum;
    }

	  public static void main(String[] args) {
		    MissingNumbers solution = new MissingNumbers();
		    int[] nums = {3, 0, 1};  
		    System.out.println("The missing number is: " + solution.missingNumber(nums));
		}

      
        
    }


