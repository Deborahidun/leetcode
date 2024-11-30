package com.bptn.leetcode.challenge_4;

public class AddTwoNumbers {

	// Static nested class to represent a single node in a linked list
	static class ListNode {
		int val; // integer that holds the value of the node
		ListNode next; // reference to the next node in the linked list

		// Constructor to initialize values
		ListNode(int val) {
			this.val = val;
			this.next = null; // initialize next to null as default
		}
	}

	// Function to add nodes from the two linked lists
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0); // a dummy node to store the result list
		ListNode current = dummy; // a pointer to traverse and build the result list
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int sum = carry;
			if (l1 != null) {
				sum += l1.val; // Add l1's value to sum if l1 is not null
				l1 = l1.next;
			}
			if (l2 != null) {
				sum += l2.val; // Add l2's value to sum if l2 is not null
				l2 = l2.next;
			}
			carry = sum / 10;
			current.next = new ListNode(sum % 10); // Add the new digit as a node
			current = current.next;
		}

		return dummy.next; // Return the newly created list
	}

	// Main method for testing
	public static void main(String[] args) {
		AddTwoNumbers challenge = new AddTwoNumbers();

		// Creating first linked list: 2 -> 4 -> 3 (represents 342)
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		// Creating second linked list: 5 -> 6 -> 4 (represents 465)
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		// Adding two numbers
		ListNode result = challenge.addTwoNumbers(l1, l2);

		// Printing the result: 7 -> 0 -> 8 (represents 807)
		System.out.print("Result: ");
		while (result != null) {
			System.out.print(result.val);
			if (result.next != null) {
				System.out.print(" -> ");
			}
			result = result.next;
		}
		System.out.println();
	}
}
