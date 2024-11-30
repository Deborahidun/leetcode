package com.bptn.leetcode.challenge_4;

public class AddTwoNumbers {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        // Constructors
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Making Solution class static
    public static class Solution {
        // Function to add two numbers represented by linked lists
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            // Dummy node to simplify result list construction
            ListNode dummyHead = new ListNode(0);
            ListNode current = dummyHead;
            int carry = 0;

            // Traverse through both lists
            while (l1 != null || l2 != null || carry != 0) {
                int sum = carry;

                // Add value from the first list if available
                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                // Add value from the second list if available
                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                // Calculate the carry for the next node
                carry = sum / 10;
                // Create new node with sum (mod 10) and move the current pointer
                current.next = new ListNode(sum % 10);
                current = current.next;
            }

            // Return the actual head of the result list (skipping dummyHead)
            return dummyHead.next;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: l1 = [2, 4, 3], l2 = [5, 6, 4]
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result list (the sum)
        System.out.print("Output: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        
    }
}

